package com.svea.webpay.paymentgw.junit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.JAXB;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.paymentgw.entity.OrderRows;
import com.svea.webpay.paymentgw.entity.Query;
import com.svea.webpay.paymentgw.entity.Response;
import com.svea.webpay.paymentgw.entity.Row;
import com.svea.webpay.paymentgw.entity.Transaction;

public class TestXmlEntities {

	private PrintStream os;
	
	@Before
	public void setUp() throws Exception {
		os = System.out;
	}

	public static Query getTestQuery() {
		Query q = new Query();
		q.setTransactionId(10001023L);
		return q;
	}
	
	@Test
	public void testQuery() {
		
		Query q = getTestQuery();
		JAXB.marshal(q, os);
		
	}

	@Test
	public void testResponse() {
		
		Response r = new Response();
		r.setStatusCode(100);
		
		Transaction tr = new Transaction();
		r.setTransaction(tr);
		
		tr.setCustomerRefNo("abcRef");
		tr.setMerchantId(1000);
		tr.setStatus("SUCCESS");
		tr.setAmount(1000L);
		tr.setCurrency("SEK");
		tr.setVat(200L);
		tr.setCapturedAmount(1000L);
		tr.setAuthorizedAmount(1000L);
		tr.setCreated(Calendar.getInstance().getTime());
		tr.setCreditStatus("?");
		tr.setCreditedAmount(0L);
		tr.setMerchantResponseCode(100);
		tr.setPaymentMethod("CARD");
		tr.setCaptureDate(tr.getCreated());
		tr.setCardtype("VISA");
		tr.setEci(0);
		tr.setMdStatus(0);
		tr.setExpiryYear(2020);
		tr.setExpiryMonth(6);
		tr.setAuthCode(100);
		
		OrderRows orows = new OrderRows();
		tr.setOrderRows(orows);
		List<Row> rows = new ArrayList<Row>();
		orows.setOrderRows(rows);
		
		Row rw = new Row();
		rw.setName("Webpay artikel");
		rw.setDescription("En superbra artikel");
		rw.setAmount(1000L);
		rw.setVat(200L);
		rw.setQuantity(1.0);
		rw.setSKU("A34");
		rw.setUnit("st");

		rows.add(rw);
		
		JAXB.marshal(r, os);
		
	}
}
