package com.svea.webpay.common.conv;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.svea.webpay.common.reconciliation.PaymentReport;

/**
 * A utility class to centralize the Json-formatting options. Mainly the date format and the field naming policy.
 * 
 * @author Daniel Tamm
 *
 */
public class JsonUtil {

	public static Gson gson;
	public static final String dfmtStr = "yyyy-MM-dd";
	public static final DateFormat dfmt;
	
	static {
		
		GsonBuilder builder = new GsonBuilder().setPrettyPrinting().setDateFormat(dfmtStr);
		builder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY);
		builder.setLenient();
		builder.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {

			@Override
			public JsonElement serialize(Date date, Type arg1, JsonSerializationContext arg2) {
				if (date == null)
					return null;
				else
					return new JsonPrimitive(new SimpleDateFormat(dfmtStr).format(date));
			}
			
		});
		gson = builder.create();
		dfmt = new SimpleDateFormat(dfmtStr);
		
	}
	
	public static String PaymentReportToJson(PaymentReport pr) {
		String result = gson.toJson(pr);
		return result;
	}
	
	public static PaymentReport JsonToPaymentReport(String json) {
		PaymentReport pr = gson.fromJson(json, PaymentReport.class);
		return pr;
	}
	
}
