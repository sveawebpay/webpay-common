package com.svea.webpay.common.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.common.conv.SveaTranslator;
import com.svea.webpay.common.conv.SveaTranslatorImpl;

public class TestTranslator {

	private String[] existingLabels = {
			"preflightCheckFixed"
	};
	private String nonExistingLabel = "no-exist";
	
	private String testLang = "sve";
	
	private SveaTranslator translator;
	
	
	@Before
	public void setUp() throws Exception {
		translator = SveaTranslatorImpl.createDefaultTranslator();
	}

	@Test
	public void testExisting() {
		
		for (String s : existingLabels) {
			
			assertTrue("Test existing label : " + s, translator.hasTranslation(s, testLang));

			System.out.println(s + " => " + translator.getTranslation(s, testLang));
			
		}
		
	}
	
	@Test
	public void testNonExisting() {
		assertFalse("Test non existing label", translator.hasTranslation(nonExistingLabel, testLang));
	}

}
