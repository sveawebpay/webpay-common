package com.svea.webpay.common.conv;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JsonInterfaceAdapter<T> implements JsonSerializer<T>, JsonDeserializer<T> {

	private static final String CLASSNAME = "CLASSNAME";
    private static final String DATA = "DATA";
	
	@Override
	public T deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
        String className = prim.getAsString();
        @SuppressWarnings("rawtypes")
		Class klass = getObjectClass(className);
            return context.deserialize(jsonObject.get(DATA), klass);		
		
	}

	@Override
	public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(CLASSNAME, src.getClass().getName());
        jsonObject.add(DATA, context.serialize(src));
        return jsonObject;		
		
	}

    @SuppressWarnings("rawtypes")
	private Class getObjectClass(String className) {
        try {
            return Class.forName(className);
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
                throw new JsonParseException(e.getMessage());
            }
    }
	
}
