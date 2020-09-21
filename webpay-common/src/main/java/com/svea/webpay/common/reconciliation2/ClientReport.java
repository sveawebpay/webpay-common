package com.svea.webpay.common.reconciliation2;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReport {

	private Integer	clientId;
	private String	recipientTaxId;
	private String	recipientBankAccountNo;
	private String	recipientBankAccountType;
	
	private ClientPaymentReport paymentReport;
	
	private List<ClientReportRow> rows;
	
	private Date	reconciliationDate;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getRecipientTaxId() {
		return recipientTaxId;
	}

	public void setRecipientTaxId(String recipientTaxId) {
		this.recipientTaxId = recipientTaxId;
	}

	public String getRecipientBankAccountNo() {
		return recipientBankAccountNo;
	}

	public void setRecipientBankAccountNo(String recipientBankAccountNo) {
		this.recipientBankAccountNo = recipientBankAccountNo;
	}

	public String getRecipientBankAccountType() {
		return recipientBankAccountType;
	}

	public void setRecipientBankAccountType(String recipientBankAccountType) {
		this.recipientBankAccountType = recipientBankAccountType;
	}

	public ClientPaymentReport getPaymentReport() {
		return paymentReport;
	}

	public void setPaymentReport(ClientPaymentReport paymentReport) {
		this.paymentReport = paymentReport;
	}

	public List<ClientReportRow> getRows() {
		return rows;
	}

	public void setRows(List<ClientReportRow> rows) {
		this.rows = rows;
	}

	public Date getReconciliationDate() {
		return reconciliationDate;
	}

	public void setReconciliationDate(Date reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}

	public ClientReport addRow(ClientReportRow row) {
		if (rows==null) {
			rows = new ArrayList<ClientReportRow>();
		}
		rows.add(row);
		return this;
	}
	
	/**
	 * 
	 * @return	The number of rows in this client report.
	 */
	@Transient
	public long getNumberOfRows() {
		if (rows==null) return 0;
		return rows.size();
	}
	
}
