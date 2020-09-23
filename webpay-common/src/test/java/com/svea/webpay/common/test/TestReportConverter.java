package com.svea.webpay.common.test;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.svea.webpay.common.conv.ReportConverter;

public class TestReportConverter {

	@Test
	public void testBigIntegerW2ToDouble() {
		
		Double result = ReportConverter.bigIntegerW2ToDouble(BigInteger.valueOf(10020));
		Assert.assertEquals(Double.valueOf(100.20), result);
		
	}
	
}
