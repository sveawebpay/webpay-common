package com.svea.webpay.common.reconciliation2;

import java.util.ArrayList;
import java.util.List;

public class ReconciliationReport {

	/**
	 * MerchantId used to generate this report.
	 */
	private String	merchantId;
	
	private Long totalNrOfRows;
	
	private List<ClientReport> clientReports;

	public Long getTotalNrOfRows() {
		return totalNrOfRows;
	}

	public void setTotalNrOfRows(Long totalNrOfRows) {
		this.totalNrOfRows = totalNrOfRows;
	}

	/**
	 * Add a client report to this reconciliation report.
	 * 
	 * @param r
	 * @return
	 */
	public ReconciliationReport addClientReport(ClientReport r) {
		
		if (clientReports==null) {
			clientReports = new ArrayList<ClientReport>();
		}
		clientReports.add(r);
		if (totalNrOfRows==null) {
			totalNrOfRows = 0L;
		}

		// Add total number of rows
		totalNrOfRows += r.getNumberOfRows();
		
		return this;
		
	}
	
	public List<ClientReport> getClientReports() {
		return clientReports;
	}

	public void setClientReports(List<ClientReport> clientReports) {
		this.clientReports = clientReports;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
}
