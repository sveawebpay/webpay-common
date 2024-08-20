package com.svea.webpay.common.conv;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class used to translate different terms and other labels / etc.
 * 
 * @author Daniel Tamm
 *
 */
public class SveaTranslatorImpl implements SveaTranslator {
		
	private Logger log = LoggerFactory.getLogger(SveaTranslatorImpl.class);
	
	private ClassLoader	classLoader;

	private boolean translated = false;
	
	public static final String SVEA_TRANSLATIONS_LABEL = "SveaTranslations";
	
	public static Locale[] supportedLocales = {
			Locale.ENGLISH,
			new Locale("sv")
	};

	private Map<String, ResourceBundle> bundles;
	private ResourceBundle defaultBundle;

	public static SveaTranslator createDefaultTranslator() {
		SveaTranslatorImpl st = new SveaTranslatorImpl();
		st.setClassLoader(SveaTranslatorImpl.class.getClassLoader());
		return st;
	}

	public static SveaTranslator createTranslatorUsingClassLoaderForBundles(ClassLoader classLoaderToUseForBundles) {
		SveaTranslatorImpl st = new SveaTranslatorImpl();
		st.setClassLoader(classLoaderToUseForBundles);
		return st;
	}
	
	public SveaTranslatorImpl() {
	}
	
	private void setClassLoader(ClassLoader classLoaderToUseForBundles) {

		if (classLoaderToUseForBundles==null) {
			classLoaderToUseForBundles = this.getClass().getClassLoader();
		}
		classLoader = classLoaderToUseForBundles;
		
		bundles = new TreeMap<String, ResourceBundle>();
		ResourceBundle b;
		for (Locale loc : supportedLocales) {
			
			try {
				b = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL, loc, classLoaderToUseForBundles);
				if (b!=null && b.getLocale().getLanguage().equals(loc.getLanguage())) {
					bundles.put(loc.getISO3Language(), b);
				}
			} catch (MissingResourceException mre) {
				logMissingResourceBundle(mre);
			}
			
		}

		try {
			defaultBundle = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL, Locale.getDefault(), classLoaderToUseForBundles);
		} catch (MissingResourceException mre) {
			logMissingResourceBundle(mre);
		}
		
	}

	private void logMissingResourceBundle(MissingResourceException mre) {
		
		String logMessage = "SveaTranslatorImpl: Missing resourcebundle for " + mre.getClassName() + " with classloader " + classLoader.toString();
		log.warn(logMessage);
		System.err.println(logMessage);
		
	}
	
	/**
	 * Returns a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to in ISO3 format (e.g. 'eng')
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	@Override
	public String getTranslation(String label, String lang) {

		translated = false;
		// Locate the bundle
		ResourceBundle b = bundles.get(lang);
		if(b == null) {
			if(defaultBundle == null){
				return label;
			}else{
				b = defaultBundle;
			}
		}
		String translation = null;
		try {
			// Workaround since ResourceBundle in Java 8 doesn't support UTF-8
			// translation = new String(b.getString(label).getBytes("ISO-8859-1"), "UTF-8");
			translation = b.getString(label);
			translated = true;
		} catch (MissingResourceException me) {
			log.warn(String.format("Resource %s could not be found", label), me);
			translation = label;
		} 
		/* catch (UnsupportedEncodingException e) {
			log.error("Unsupported encoding", e);
			translation = label;
		} */

		return translation;
		
	}

	/**
	 * Returns true if there's a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to
	 * @return			True if a translation exists
	 */
	@Override
	public boolean hasTranslation(String label, String lang) {
		getTranslation(label, lang);
		return translated;
	}
	
	
	/**
	 * Returns a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to in ISO3 format (e.g. 'eng')
	 * 
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	@Override
	public String getTranslationAndCapitalizeFirstLetter(String label, String lang) {

		return capitalizeFirstLetter(getTranslation(label, lang));
		
	}

	/**
	 * Capitalizes first letter of a text.
	 * 
	 * @param text		The text.
	 * @return			The text with the first letter as a capital letter.
	 */
	private String capitalizeFirstLetter(String text) {
		if (text==null) return null;
		StringBuffer sb = new StringBuffer(text);
		sb.replace(0, 1, text.substring(0, 1).toUpperCase());
		return sb.toString();
	}
	
}
