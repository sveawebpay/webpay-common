package com.svea.webpay.common.conv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class to parse and print tax id:s in different formats.
 * 
 * At the moment only Swedish tax id's are supported. 
 * 
 * @author Daniel Tamm
 *
 */
public class TaxIdFormatter {

	private static Pattern	se10 = Pattern.compile("^(\\d{2})(\\d{2})(\\d{2})(\\d{4})$"); 
	private static Pattern	se11 = Pattern.compile("^(\\d{2})(\\d{2})(\\d{2})\\-(\\d{4})$");
	private static Pattern	se12 = Pattern.compile("^(\\d{4})(\\d{2})(\\d{2})(\\d{4})$"); 
	private static Pattern	se14 = Pattern.compile("^SE(\\d{2})(\\d{2})(\\d{2})(\\d{4})01$");
	
	private static Pattern	no09 = Pattern.compile("^(\\d{3})(\\d{3})(\\d{3}).*");
	private static Pattern	no11 = Pattern.compile("^(\\d{3})\\s*?(\\d{3})\\s*?(\\d{3}).*");

	private static Pattern	fi08 = Pattern.compile(".*?(\\d{7})(\\d)$");
	private static Pattern	fi09 = Pattern.compile(".*?(\\d{7})\\-(\\d)$");
	
	/**
	 * Remove all non digit characters
	 *
	 * @param cleanUp		String to be cleaned.
	 * @return				A cleaned string.
	 */
	public static String toDigitsOnly(String cleanUp) {
		if (cleanUp==null) return("");
		StringBuffer buf = new StringBuffer();
		char c;
		for (int i=0; i<cleanUp.length();i++) {
			c = cleanUp.charAt(i);
			if (c>='0' && c<='9') {
				buf.append(c);
			}
		}
		return(buf.toString());
	}

    public static boolean hasDigitsOnly(String ref) {
        if (ref==null || ref.trim().length()==0) return(false);
        char c;
        for (int i=0; i<ref.length(); i++) {
            c = ref.charAt(i);
            if (!(c>='0' && c<='9')) {
                return(false);
            }
        }
        return true;
    }
	
    /**
     * Remove blanks from a string.
     * 
     * @param cleanUp		String to clean up.
     * @return				A string without blanks.
     */
    public static String removeBlanks(String cleanUp) {
    	if (cleanUp==null) return null;
    	StringBuffer result = new StringBuffer();
    	char c;
    	for (int i=0;i<cleanUp.length(); i++) {
    		c = cleanUp.charAt(i);
    		if (c==' ' || c=='\t' || c=='\n' || c=='\r')
    			continue;
    		result.append(c);
    	}
    	return result.toString();
    }
    
    /**
     * Print tax id in given format.
     * 
     * @param srcFormat		The format of the taxId-attribute. If null, the tax id format tries to be determined.
     * 						Note, this can be lengthy.
     * @param taxId			The actual tax id.
     * @param dstFormat		The destination format.
     * @return
     * @throws UnknownTaxIdFormatException 
     * @throws InvalidTaxIdFormatException 
     */
    public static String printTaxId(String srcFormat, String taxId, String dstFormat) throws UnknownTaxIdFormatException, InvalidTaxIdFormatException {
    	
    	if (dstFormat==null)
    		throw new UnknownTaxIdFormatException("Destination format can't be null.");
    	
    	taxId = removeBlanks(taxId);
    	
    	if (srcFormat==null || srcFormat.trim().length()==0) {
    		srcFormat = determineFormat(null, taxId);
    	}
    	
    	if (srcFormat==null || srcFormat.equals(TaxIdStructure.FMT_UNKNOWN)) {
    		throw new UnknownTaxIdFormatException("Source format: " + srcFormat);
    	}
    	
    	TaxIdStructure t = null;
    	Matcher m;
    	
    	if (!srcFormat.substring(0, 2).equals(dstFormat.substring(0, 2))) {
    		throw new InvalidTaxIdFormatException("You can't convert between different countries tax id format. " + srcFormat + " => " + dstFormat);
    	}
    	if (TaxIdStructure.FMT_SE10.equalsIgnoreCase(srcFormat)) {
    		m = se10.matcher(taxId);
    	} else if (TaxIdStructure.FMT_SE11.equalsIgnoreCase(srcFormat)) {
    		m = se11.matcher(taxId);
    	} else if (TaxIdStructure.FMT_SE12.equalsIgnoreCase(srcFormat)) {
    		m = se12.matcher(taxId);
    	} else if (TaxIdStructure.FMT_SE14.equalsIgnoreCase(srcFormat)) {
    		m = se14.matcher(taxId);
    	} else if (TaxIdStructure.FMT_FI08.equalsIgnoreCase(srcFormat)) {
    		m = fi08.matcher(taxId);
    	} else if (TaxIdStructure.FMT_FI09.equalsIgnoreCase(srcFormat)) {
    		m = fi09.matcher(taxId);
    	} else if (TaxIdStructure.FMT_NO09.equalsIgnoreCase(srcFormat)) {
    		m = no09.matcher(taxId);
    	} else if (TaxIdStructure.FMT_NO11.equalsIgnoreCase(srcFormat)) {
    		m = no11.matcher(taxId);
    	} else {
    		throw new UnknownTaxIdFormatException("Source format: " + srcFormat);
    	}

		if (!m.matches()) {
			throw new InvalidTaxIdFormatException("Taxid " + taxId + " doesn't conform to source format " + srcFormat + ".");
		}
		t = createTaxIdStructureFromMatcher(m, srcFormat);

		return t.printTaxId(dstFormat);
    	
    }
    
    /**
     * Reads the groups from a matching matcher into a tax id structure.
     * @param m
     * @return
     */
    private static TaxIdStructure createTaxIdStructureFromMatcher(Matcher m, String taxIdFormat) {

    	TaxIdStructure t = new TaxIdStructure(taxIdFormat);
    	if ("SE".equalsIgnoreCase(t.getCountryCode())) {
	    	t.setPrefix(m.group(1));
			t.setLeftmiddle(m.group(2));
			t.setRightmiddle(m.group(3));
			t.setSuffix(m.group(4));
    	} else if ("NO".equalsIgnoreCase(t.getCountryCode())) {
    		t.setPrefix(m.group(1));
    		t.setLeftmiddle(m.group(2));
    		t.setSuffix(m.group(3));
    	} else if ("FI".equalsIgnoreCase(t.getCountryCode())) {
    		t.setPrefix(m.group(1));
    		t.setSuffix(m.group(2));
    	}
    	return t;
    	
    }
    
    /**
     * Determines tax id format by applying a number of regular expressions to the tax id.
     *
     * @param countryCode		If country code is supplied, only that country's tax id patterns are tried.
     * @param taxId				The tax id to determine.
     * @return					The tax id format. If it can't be matched, TaxIdStructure.FMT_UNKNOWN is returned.
     */
    public static String determineFormat(String countryCode, String taxId) {
    	
    	if (taxId==null) return null;
    	// Remove blanks
    	taxId = removeBlanks(taxId);
    	
    	if (countryCode==null || countryCode.trim().length()==0 || "SE".equalsIgnoreCase(countryCode)) {
	    	Matcher m10 = se10.matcher(taxId);
	    	if (m10.matches())
	    		return TaxIdStructure.FMT_SE10;
	    	
	    	Matcher m11 = se11.matcher(taxId);
	    	if (m11.matches()) {
	    		return TaxIdStructure.FMT_SE11;
	    	}
	    	
	    	Matcher m12 = se12.matcher(taxId);
	    	if (m12.matches()) {
	    		return TaxIdStructure.FMT_SE12;
	    	}
	    	
	    	Matcher m14 = se14.matcher(taxId);
	    	if (m14.matches()) {
	    		return TaxIdStructure.FMT_SE14;
	    	}
	    	
    	}
    	if (countryCode==null || countryCode.trim().length()==0 || "NO".equalsIgnoreCase(countryCode)) {
	    	Matcher mno09 = no09.matcher(taxId);
	    	if (mno09.matches()) {
	    		return TaxIdStructure.FMT_NO09;
	    	}
	    	Matcher mno11 = no11.matcher(taxId);
	    	if (mno11.matches()) {
	    		return TaxIdStructure.FMT_NO11;
	    	}
	    	
    	}
    	
    	if (countryCode==null || countryCode.trim().length()==0 || "FI".equalsIgnoreCase(countryCode)) {

	    	Matcher mfi08 = fi08.matcher(taxId);
	    	if (mfi08.matches()) {
	    		return TaxIdStructure.FMT_FI08;
	    	}
	    	Matcher mfi09 = fi09.matcher(taxId);
	    	if (mfi09.matches()) {
	    		return TaxIdStructure.FMT_FI09;
	    	}
    	}
    	
    	return TaxIdStructure.FMT_UNKNOWN;
    }
    
    
	
}
