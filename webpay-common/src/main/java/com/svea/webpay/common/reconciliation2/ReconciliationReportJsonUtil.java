package com.svea.webpay.common.reconciliation2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * A utility class to centralize the Json-formatting options. Mainly the date format and the field naming policy.
 * 
 * @author Daniel Tamm
 *
 */
public class ReconciliationReportJsonUtil {

	public static Gson gson;
	public static final String dfmtStr = "yyyy-MM-dd'T'HH:mm:ss";
	public static final DateFormat dfmt;
	
	static {
		
		GsonBuilder builder = new GsonBuilder().setPrettyPrinting().setDateFormat(dfmtStr);
		builder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY);
		builder.setDateFormat(dfmtStr);
		builder.registerTypeAdapter(Date.class, new DateSerializer());
		builder.setLenient();
		gson = builder.create();
		dfmt = new SimpleDateFormat(dfmtStr);
		
	}
	
	public static String ReconciliationReportToJson(ReconciliationReport pr) {
		String result = gson.toJson(pr);
		return result;
	}
	
	public static ReconciliationReport JsonToReconciliationReport(String json) {
		ReconciliationReport pr = gson.fromJson(json, ReconciliationReport.class);
		return pr;
	}
	
}
