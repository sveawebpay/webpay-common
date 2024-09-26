package com.svea.webpay.common.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.common.conv.SveaTranslator;
import com.svea.webpay.common.conv.SveaTranslatorImpl;

public class TestCustomTranslations {

	private String[] existingLabels = {
			"custom_translation"
	};
	private String nonExistingLabel = "no-exist";
	
	private String testLang = "swe";
	
	private SveaTranslator translator;
	
	
	@Before
	public void setUp() throws Exception {
		translator = SveaTranslatorImpl.createDefaultTranslator();
		translator.addBundle("CustomTranslations", this.getClass().getClassLoader());
	}

	@Test
	public void testExisting() {
		
		for (String s : existingLabels) {
			
			assertTrue("Test existing label : " + s, translator.hasTranslation(s, testLang));

			String translation = translator.getTranslation(s, testLang);
			
			System.out.println(s + " => " + translation);
			
		}
		
	}
	
	@Test
	public void testNonExisting() {
		assertFalse("Test non existing label", translator.hasTranslation(nonExistingLabel, testLang));
	}

}
