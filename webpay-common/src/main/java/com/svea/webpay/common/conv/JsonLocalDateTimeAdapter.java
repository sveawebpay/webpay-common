package com.svea.webpay.common.conv;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JsonLocalDateTimeAdapter implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {

	private static final DateTimeFormatter FMT = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
	
	@Override
	public JsonElement serialize(LocalDateTime src, Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(src.format(FMT));
	}

	@Override
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	        throws JsonParseException {

	    if (json == null || json.isJsonNull()) return null;

	    // Case 1: "2026-01-19T10:15:30"
	    if (json.isJsonPrimitive()) {
	        return LocalDateTime.parse(json.getAsString(), FMT);
	    }

	    if (json.isJsonObject()) {
	        JsonObject obj = json.getAsJsonObject();

	        // Case 2: { "value": "2026-01-19T10:15:30" }
	        JsonElement v = obj.get("value");
	        if (v != null && !v.isJsonNull() && v.isJsonPrimitive()) {
	            return LocalDateTime.parse(v.getAsString(), FMT);
	        }

	        // Case 3: { "dateTime": "2026-01-19T10:15:30" }
	        JsonElement s = obj.get("dateTime");
	        if (s != null && !s.isJsonNull() && s.isJsonPrimitive()) {
	            return LocalDateTime.parse(s.getAsString(), FMT);
	        }

	        // Case 4 (NEW): { "date": "2024-06-19", "time": { "hour":10, "minute":0, ... } }
	        JsonElement dateEl = obj.get("date");
	        JsonElement timeEl = obj.get("time");
	        if (dateEl != null && !dateEl.isJsonNull() && dateEl.isJsonPrimitive()
	                && timeEl != null && !timeEl.isJsonNull()) {

	            LocalDate date = LocalDate.parse(dateEl.getAsString()); // ISO_LOCAL_DATE

	            // time can be either a string ("10:00:59.593") or an object ({hour,minute,...})
	            LocalTime time;
	            if (timeEl.isJsonPrimitive()) {
	                time = LocalTime.parse(timeEl.getAsString()); // ISO_LOCAL_TIME
	            } else if (timeEl.isJsonObject()) {
	                JsonObject t = timeEl.getAsJsonObject();

	                int hour = getIntOrDefault(t, "hour", 0);
	                int minute = getIntOrDefault(t, "minute", 0);
	                int second = getIntOrDefault(t, "second", 0);
	                int nano = getIntOrDefault(t, "nano", 0);

	                time = LocalTime.of(hour, minute, second, nano);
	            } else {
	                throw new JsonParseException("Expected 'time' as string or object, got: " + timeEl);
	            }

	            return LocalDateTime.of(date, time);
	        }

	        throw new JsonParseException("Expected LocalDateTime as string or object with 'value'/'dateTime' or 'date'+'time', got: " + obj);
	    }

	    throw new JsonParseException("Expected LocalDateTime, got: " + json);
	}

	private static int getIntOrDefault(JsonObject obj, String key, int def) {
	    JsonElement el = obj.get(key);
	    if (el == null || el.isJsonNull()) return def;

	    if (el.isJsonPrimitive()) {
	        JsonPrimitive p = el.getAsJsonPrimitive();
	        if (p.isNumber()) return p.getAsInt();
	        if (p.isString()) {
	            try { return Integer.parseInt(p.getAsString()); }
	            catch (NumberFormatException e) {
	                throw new JsonParseException("Expected numeric value for '" + key + "', got: " + p, e);
	            }
	        }
	    }
	    throw new JsonParseException("Expected number for '" + key + "', got: " + el);
	}
}
