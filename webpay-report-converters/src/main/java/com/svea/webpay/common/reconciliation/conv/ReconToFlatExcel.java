package com.svea.webpay.common.reconciliation.conv;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;

import com.svea.webpay.common.reconciliation.PaymentReport;

public class ReconToFlatExcel implements ReconInputConverter {

	private CellStyle	dateCellStyle;
	private CellStyle	headerCellStyle;
	private String 		dateFormatStr;
	
	public final static String	defaultDateFormatStr = "yyyy-MM-dd"; 
	public final static String defaultFileName = "reconciliation-report";
	
	public static Integer[] colWidths = new Integer[] {
		12*256,		// Recipient tax id
		16*256,		// Payer tax id
		null,
		12*256,		// Reconciliation date
		null,
		null,
		40*256,		// Name
		30*256,		// Email
		null,		// Zipcode
		20*256,		// External Order number
	};
	
	private int rowNum;
	private int colNum;
	private Row		row;
	private Cell	cell;
	
	private File	outFile;
	private String	outFilePrefix;

	public String getDateFormatStr() {
		return dateFormatStr;
	}

	public void setDateFormatStr(String dateFormatStr) {
		this.dateFormatStr = dateFormatStr;
	}
	
	public String getOutFilePrefix() {
		return outFilePrefix;
	}

	public void setOutFilePrefix(String outFilePrefix) {
		this.outFilePrefix = outFilePrefix;
		if (this.outFilePrefix!=null) {
			if (this.outFilePrefix.endsWith(".json")) {
				this.outFilePrefix = this.outFilePrefix.substring(0, outFilePrefix.length()-5);
			}
		}
	}

	public File getOutFile() {
		return outFile;
	}
	
	public void setOutFile(File outFile) {
		this.outFile = outFile;
	}

	/**
	 * Call this to reset out file if outfile should be generated automatically. 
	 */
	public void reset() {
		outFile = null;
	}

	public File createExcelFile(PaymentReport report) throws ParseException, EncryptedDocumentException, InvalidFormatException, IOException {

		String outFileName = null;
		
		// Make sure we have a reasonable file name
		if (outFile==null) {
			if (outFilePrefix!=null && outFilePrefix.trim().length()>0) {
				outFileName = outFilePrefix;
			} else {
				if (report.getTaxId()!=null && report.getTaxId().trim().length()>0) {
					outFileName = report.getTaxId();
				}
				if (report.getOrgName()!=null && report.getOrgName().trim().length()>0) {
					if (outFileName!=null && outFileName.trim().length()>0) {
						outFileName += "-" + report.getOrgName();
					} else {
						outFileName = report.getOrgName();
					}
				}
				if (outFileName==null || outFileName.trim().length()==0) {
					outFileName = defaultFileName;
				}
				if (report.getPaymentReportGroup()!=null && report.getPaymentReportGroup().size()>0) {
					outFileName += "-"+report.getPaymentReportGroup().get(0).getReconciliationDate();
					outFileName += "-"+report.getPaymentReportGroup().get(0).getCurrency();
				}
			}
			outFile = new File(outFileName);
		}
		if (!outFile.getAbsolutePath().toLowerCase().endsWith(".xlsx")) {
			outFile = new File(outFile.getAbsolutePath() + ".xlsx");
		}
		
		ReconToFlatFormat flatConverter = new ReconToFlatFormat();
		// Use trx to represent in- and out balance.
		flatConverter.setCreateBalanceTrxForDebt(true);
		
		List<Object[]> rows = flatConverter.convertFromReconToRowObjects(report);
		
		SXSSFWorkbook wb = new SXSSFWorkbook(rows.size()+1);
		
		// Create date format
		if (dateFormatStr==null || dateFormatStr.trim().length()==0) {
			dateFormatStr = defaultDateFormatStr;
		}
		
		CreationHelper createHelper = wb.getCreationHelper(); 
		dateCellStyle = wb.createCellStyle();
		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat(dateFormatStr));
		
		headerCellStyle = wb.createCellStyle();
		headerCellStyle.setWrapText(true);
		
		Font font = wb.createFont();
		font.setBold(true);
		headerCellStyle.setFont(font);
		
		Sheet sheet = wb.createSheet();
		
		// Initialize rowNum
		rowNum = 0;
		
		if (rows.size()>0) {
			createHeader(sheet, rows.get(0));
			
			for (int i = 1; i<rows.size(); i++) {
				createRow(sheet, rows.get(i));
			}
			
		}
		
		XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
		sheet.createFreezePane(0, 1);
		
		FileOutputStream out = new FileOutputStream(outFile);
		wb.write(out);
		out.close();
		wb.dispose();
		
		return outFile;
		
	}

	private void createRow(Sheet sh, Object[] srcRow) {

		colNum = 0;
		
		row = sh.createRow(rowNum++);
		Object srcColumn;
		
		for (int i=0; i<srcRow.length; i++) {
		
			srcColumn = srcRow[i];
			
			if (srcColumn instanceof String) {
				cell = row.createCell(colNum++);
				cell.setCellValue((String)srcColumn);
			} else if (srcColumn instanceof java.util.Date) {
				cell = row.createCell(colNum++);
				cell.setCellValue((java.util.Date)srcColumn);
				cell.setCellStyle(dateCellStyle);
			} else if (srcColumn instanceof Double || srcColumn instanceof Integer) {
				cell = row.createCell(colNum++);
				cell.setCellValue((double)srcColumn);
			} else {
				cell = row.createCell(colNum++);
				if (srcColumn!=null)
					cell.setCellValue(srcColumn.toString());
			}
			
		}
		
		
	}
	
	/**
	 * Creates a header in given sheet.
	 * @param sh				The sheet to create header in
	 * @param columnHeaders		The headers (an array of strings)
	 */
	private void createHeader(Sheet sh, Object[] columnHeaders) {

		colNum = 0;
		row = sh.createRow(rowNum++);
		row.setHeightInPoints(40);
		for (Object c : columnHeaders) {
			cell = row.createCell(colNum++);
			cell.setCellStyle(headerCellStyle);
			cell.setCellValue((String)c);
			
			// Set column width if specified
			if (colWidths.length>(colNum-1) && colWidths[colNum-1]!=null) {
				sh.setColumnWidth(colNum-1, colWidths[colNum-1]);
			}
		}
		
	}
	
	/**
	 * @return		A list of file names
	 */
	@Override
	public List<StringBuffer> convertFromRecon(PaymentReport report)
			throws Exception {

		List<StringBuffer> result = new ArrayList<StringBuffer>();
		File createdFile = createExcelFile(report);
		
		if (createdFile!=null) {
			result.add(new StringBuffer(createdFile.getAbsolutePath()));
		}
		
		return result;
	}

}
