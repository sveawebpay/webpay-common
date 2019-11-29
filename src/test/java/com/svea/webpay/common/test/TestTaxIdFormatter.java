package com.svea.webpay.common.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.common.conv.InvalidTaxIdFormatException;
import com.svea.webpay.common.conv.TaxIdFormatter;
import com.svea.webpay.common.conv.TaxIdStructure;
import com.svea.webpay.common.conv.UnknownTaxIdFormatException;

public class TestTaxIdFormatter {

	public String taxId_SE10 = "5555555555";
	public String taxId_SE11 = "555555-5555";
	public String taxId_SE12 = "165555555555";
	public String taxId_SE10_person = "1804185555";
	public String taxId_SE14 = "SE555555555501";
	public String taxId_FI08 = "55555555";
	public String taxId_FI09 = "5555555-5";
	public String taxId_NO09 = "123123123";
	public String taxId_NO11 = "123 123 123";
	public String taxId_NO14 = "123123123MVA";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrintTaxId() {
		
		try {
			String result = null;
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_SE10, taxId_SE10, TaxIdStructure.FMT_SE12);
			System.out.println(taxId_SE10 + " printed in format " + TaxIdStructure.FMT_SE12 + " : " + result);
			assertEquals("", taxId_SE12, result);

			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_SE10, taxId_SE10, TaxIdStructure.FMT_SE14);
			System.out.println(taxId_SE10 + " printed in format " + TaxIdStructure.FMT_SE14 + " : " + result);
			assertEquals("", taxId_SE14, result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_SE10, taxId_SE10_person, TaxIdStructure.FMT_SE12);
			System.out.println(taxId_SE10_person + " printed in format " + TaxIdStructure.FMT_SE12 + " : " + result);
			assertEquals("", "XX" + taxId_SE10_person, result);

			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_SE10, taxId_SE10_person, TaxIdStructure.FMT_SE11);
			System.out.println(taxId_SE10_person + " printed in format " + TaxIdStructure.FMT_SE11 + " : " + result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_SE12, taxId_SE12, TaxIdStructure.FMT_SE11);
			System.out.println(taxId_SE12 + " printed in format " + TaxIdStructure.FMT_SE11 + " : " + result);
			assertEquals("", taxId_SE11, result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_FI08, taxId_FI08, TaxIdStructure.FMT_FI09);
			System.out.println(taxId_FI08 + " printed in format " + TaxIdStructure.FMT_FI09 + " : " + result);
			assertEquals("", taxId_FI09, result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_FI09, taxId_FI09, TaxIdStructure.FMT_FI08);
			System.out.println(taxId_FI09 + " printed in format " + TaxIdStructure.FMT_FI08 + " : " + result);
			assertEquals("", taxId_FI08, result);

			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_NO09, taxId_NO09, TaxIdStructure.FMT_NO11);
			System.out.println(taxId_NO09 + " printed in format " + TaxIdStructure.FMT_NO11 + " : " + result);
			assertEquals("", taxId_NO11, result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_NO11, taxId_NO11, TaxIdStructure.FMT_NO09);
			System.out.println(taxId_NO11 + " printed in format " + TaxIdStructure.FMT_NO09 + " : " + result);
			assertEquals("", taxId_NO09, result);
			
			result = TaxIdFormatter.printTaxId(TaxIdStructure.FMT_NO09, taxId_NO14, TaxIdStructure.FMT_NO11);
			System.out.println(taxId_NO14 + " printed in format " + TaxIdStructure.FMT_NO11 + " : " + result);
			
		} catch (UnknownTaxIdFormatException e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
		} catch (InvalidTaxIdFormatException e) {
			e.printStackTrace(System.err);
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testDetermineFormat() {
		
		assertEquals("Failed to identify " + TaxIdStructure.FMT_SE10, TaxIdStructure.FMT_SE10, TaxIdFormatter.determineFormat(null, taxId_SE10));
		assertEquals("Failed to identify " + TaxIdStructure.FMT_SE11, TaxIdStructure.FMT_SE11, TaxIdFormatter.determineFormat(null, taxId_SE11));
		assertEquals("Failed to identify " + TaxIdStructure.FMT_SE12, TaxIdStructure.FMT_SE12, TaxIdFormatter.determineFormat(null, taxId_SE12));
		assertEquals("Failed to identify " + TaxIdStructure.FMT_SE14, TaxIdStructure.FMT_SE14, TaxIdFormatter.determineFormat(null, taxId_SE14));
		
	}

}
