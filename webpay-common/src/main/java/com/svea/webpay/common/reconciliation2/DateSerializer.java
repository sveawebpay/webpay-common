package com.svea.webpay.common.reconciliation2;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class DateSerializer  implements JsonSerializer<Date> {

	@Override
	public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
		
		if (src==null)
			return null;
		
		return new JsonPrimitive(ReconciliationReportJsonUtil.dfmt.format(src));			
	}
	
}
