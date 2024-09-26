package com.svea.webpay.common.conv;

import java.util.ArrayList;
import java.util.List;
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

	private boolean translated = false;
	
	public static final String SVEA_TRANSLATIONS_LABEL = "SveaTranslations";
	
	public static Locale[] supportedLocales = {
			Locale.ENGLISH,
			new Locale("sv")
	};

	private Map<String, List<ResourceBundle>> bundles;
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
	
	/**
	 * Adds an existing resource bundle to the translator.
	 * 
	 * @param bundleName			The name where the resource will be found.
	 * @param loader				The classloader that will find the bundle.
	 */
	public void addBundle(String bundleName, ClassLoader loader) {
		
		List<ResourceBundle> blist;
		ResourceBundle b;
		
		for (Locale loc : supportedLocales) {
			
			try {
				b = ResourceBundle.getBundle(bundleName, loc, loader);
				if (b!=null && b.getLocale().getLanguage().equals(loc.getLanguage())) {
					blist = bundles.get(loc.getISO3Language());
					if (blist==null) {
						blist = new ArrayList<ResourceBundle>();
						bundles.put(loc.getISO3Language(), blist);
					}
					blist.add(b);
				}
			} catch (MissingResourceException mre) {
				logMissingResourceBundle(mre, loader);
			}
			
		}
		
		
	}
	
	private void setClassLoader(ClassLoader classLoaderToUseForBundles) {

		if (classLoaderToUseForBundles==null) {
			classLoaderToUseForBundles = this.getClass().getClassLoader();
		}
		
		bundles = new TreeMap<String, List<ResourceBundle>>();
		List<ResourceBundle> blist;
		ResourceBundle b;
		
		for (Locale loc : supportedLocales) {
			
			try {
				b = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL, loc, classLoaderToUseForBundles);
				if (b!=null && b.getLocale().getLanguage().equals(loc.getLanguage())) {
					blist = bundles.get(loc.getISO3Language());
					if (blist==null) {
						blist = new ArrayList<ResourceBundle>();
						bundles.put(loc.getISO3Language(), blist);
					}
					blist.add(b);
				}
			} catch (MissingResourceException mre) {
				logMissingResourceBundle(mre, classLoaderToUseForBundles);
			}
			
		}

		try {
			defaultBundle = ResourceBundle.getBundle(SVEA_TRANSLATIONS_LABEL, Locale.getDefault(), classLoaderToUseForBundles);
		} catch (MissingResourceException mre) {
			logMissingResourceBundle(mre, classLoaderToUseForBundles);
		}
		
	}

	private void logMissingResourceBundle(MissingResourceException mre, ClassLoader loader) {
		
		String logMessage = "SveaTranslatorImpl: Missing resourcebundle for " + mre.getClassName() + " with classloader " + loader.toString();
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

		if ("sv".equals(lang)) {
			lang = "swe";
		} else if ("en".equals(lang)) {
			lang = "eng";
		}
		
		translated = false;
		// Locate the bundle
		List<ResourceBundle> blist = bundles.get(lang);
		if(blist == null) {
			if(defaultBundle == null){
				return label;
			}else{
				blist = new ArrayList<ResourceBundle>();
				blist.add(defaultBundle);
			}
		}
		String translation = null;
		try {
			// Workaround since ResourceBundle in Java 8 doesn't support UTF-8
			// translation = new String(b.getString(label).getBytes("ISO-8859-1"), "UTF-8");
			translation = getTranslationFromListOfBundles(blist, label);
			translated = true;
		} catch (MissingResourceException me) {
			log.debug(String.format("Resource %s could not be found", label));
			translation = label;
		} 
		/* catch (UnsupportedEncodingException e) {
			log.error("Unsupported encoding", e);
			translation = label;
		} */

		return translation;
		
	}

	private String getTranslationFromListOfBundles(List<ResourceBundle> blist, String label) {
		if (blist==null || blist.size()==0) throw new MissingResourceException(label, label, label);
		String translated = null;
		for (ResourceBundle b : blist) {
			try {
				translated = b.getString(label);
				break;
			} catch (MissingResourceException me) {}
		}
		if (translated==null) {
			throw new MissingResourceException(label, label, label);
		}
		return translated;
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
