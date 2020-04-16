package com.svea.webpay.common.reconciliation.conv;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.PaymentReportDetail;
import com.svea.webpay.common.reconciliation.PaymentReportGroup;

public class ExcelToReconFormat {

	private FormulaEvaluator evaluator;
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * Creates payment report from an Excel spreadsheet with the following columns
	 * Transaktions-id, Ordernr, Betalmetod, Belopp, Valuta, Tid
	 * 
	 * @param filename
	 * @return
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 * @throws ParseException 
	 */
	public PaymentReport fromExcelFileCCFormat(
			String filename,
			String taxId,
			String orgName,
			String paymentType,
			String dstAcct
			) throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		File f = new File(filename);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
		return fromExcelInputStreamCCFormat(bis, taxId, orgName, paymentType, dstAcct);
		
	}
	
	public PaymentReport fromExcelInputStreamCCFormat(
			InputStream inp,
			String taxId,
			String orgName,
			String paymentType,
			String dstAcct
			) throws 
		EncryptedDocumentException, 
		InvalidFormatException, 
		IOException,
		ParseException {
		
		Workbook wb = WorkbookFactory.create(inp);
		evaluator = wb.getCreationHelper().createFormulaEvaluator();
		
		PaymentReport result = new PaymentReport();
		result.setTaxId(taxId);
		result.setOrgName(orgName);
		
		PaymentReportGroup group = null;
		PaymentReportDetail pmt = null;
		Map<String, Map<Instant,PaymentReportGroup>> currencyMap = new TreeMap<String, Map<Instant,PaymentReportGroup>>();
		Map<Instant, PaymentReportGroup> groupDateMap = null;
		
		// Get first sheet
		Sheet sheet = wb.getSheetAt(0);
		
		Row row;
		Date currentDate = null;
		Date reconciliationDate = null;
		String currentCurrency = null;
		String reconciliationCurrency = null;
		
		// Iterate through all rows, skip first row as it should be the title
		for (int r = 1; r<sheet.getLastRowNum()+1; r++) {
			
			row = sheet.getRow(r);
			
			// Check for blank rows
			if (row.getCell(1)==null || CellType.BLANK.equals(row.getCell(1).getCellTypeEnum())) {
				continue;
			}
			
			reconciliationDate = group!=null ? group.getReconciliationDateAsDate() : null;
			reconciliationCurrency = group!=null ? group.getCurrency() : null;
			
			currentCurrency = getCellAsString(row.getCell(4));
			currentDate = getDate(row.getCell(5));

			if (currentCurrency!=null) {
				if (!currentCurrency.equalsIgnoreCase(reconciliationCurrency)) {
					groupDateMap = currencyMap.get(currentCurrency);
					if (groupDateMap==null) {
						groupDateMap = new TreeMap<Instant, PaymentReportGroup>();
						currencyMap.put(currentCurrency, groupDateMap);
					}
				}
			}
			
			if (currentDate!=null) {
				Instant cDate = Instant.ofEpochMilli(currentDate.getTime()).truncatedTo(ChronoUnit.DAYS);
				Instant rDate = reconciliationDate!=null ? Instant.ofEpochMilli(reconciliationDate.getTime()).truncatedTo(ChronoUnit.DAYS) : null;
				if (!cDate.equals(rDate)) {
					group = groupDateMap.get(cDate);
					if (group==null) {
						group = new PaymentReportGroup();
						group.setCurrency(currentCurrency);
						group.setDstAcct(dstAcct);
						group.setPaymentType(paymentType);
						group.setReconciliationDate(new Date(cDate.toEpochMilli()));
						groupDateMap.put(cDate, group);
						result.addPaymentReportGroup(group);
					}
				}
			}
			
			if (group==null) throw new InvalidFormatException("No date for payment transaction on row " + r);
			
			pmt = new PaymentReportDetail();
			pmt.setPaymentId(getCellAsString(row.getCell(0)));
			pmt.setClientOrderNo(getCellAsString(row.getCell(1)));
			
			// Check client reference for retries. Remove the retry string.
			if (pmt.getClientOrderNo()!=null) {
				int c =	pmt.getClientOrderNo().indexOf("-WRetry");
				if (c>=0) {
					pmt.setClientOrderNo(pmt.getClientOrderNo().substring(0, c));
				}
			}
			pmt.setPaidAmt(row.getCell(3).getNumericCellValue());
			pmt.setReceivedAmt(row.getCell(3).getNumericCellValue());
			group.addDetail(pmt);
			
		}
		
		return result;
		
	}
	
	private String getCellAsString(Cell c) {
		if (c==null) return null;
		CellType ct = c.getCellTypeEnum();
		if (ct.equals(CellType.FORMULA)) {
			CellValue cellValue = evaluator.evaluate(c);
			if (ct.equals(CellType.NUMERIC)) {
				return Integer.toString((int)cellValue.getNumberValue());
			} else {
				return cellValue.getStringValue();
			}
		}
		return (ct.equals(CellType.NUMERIC) 
				? Integer.toString((int)c.getNumericCellValue()) : c.getStringCellValue());
	}
	
	
	/**
	 * Returns date in row
	 * 
	 * @param r
	 * @return
	 * @throws ParseException 
	 */
	private Date getDate(Cell c) throws ParseException {

		if (c==null) return null;
		
		Date result = null;
		
		// Try string
		CellType ct = c.getCellTypeEnum();
		if (ct.equals(CellType.STRING)) {
			// Parse date
			result = df.parse(c.getStringCellValue());
			
		} else if (ct.equals(CellType.NUMERIC)) {
			// Get Date
			result = c.getDateCellValue();
		}
		
		return result;
	}
	
	
	
}
