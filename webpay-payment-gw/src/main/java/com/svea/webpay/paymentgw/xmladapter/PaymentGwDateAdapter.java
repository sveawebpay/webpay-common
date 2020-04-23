package com.svea.webpay.paymentgw.xmladapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PaymentGwDateAdapter extends XmlAdapter<String, Date>{

	public static DateFormat dfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
	
	@Override
	public Date unmarshal(String v) throws Exception {

		Date result = null;
		
		if (v!=null) {
			try {
				result = dfmt.parse(v);
			} catch (Exception e) {
				
			}
		}
		
		return result;
	}

	@Override
	public String marshal(Date v) throws Exception {
		if (v==null)
			return null;
		
		return dfmt.format(v);
	}

}
