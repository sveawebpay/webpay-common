package com.svea.webpay.common.conv;

public interface SveaTranslator {

	/**
	 * Returns a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to in ISO3 format (e.g. 'eng')
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	String getTranslation(String label, String lang);

	/**
	 * Returns a translation of the given label (key) and capitalizes the first letter.
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to in ISO3 format (e.g. 'eng')
	 * 
	 * @return			A translation. If no translation is available the label itself is returned.
	 */
	String getTranslationAndCapitalizeFirstLetter(String label, String lang);

	/**
	 * Adds an existing resource bundle to the translator.
	 * 
	 * @param bundleName			The name where the resource will be found.
	 * @param loader				The classloader that will find the bundle.
	 */
	public void addBundle(String bundleName, ClassLoader loader);	
	
	/**
	 * Returns true if there's a translation of the given label (key).
	 * 
	 * @param label		The label to translate
	 * @param lang		The language to translate to
	 * @return			True if a translation exists
	 */
	public boolean hasTranslation(String label, String lang);	
	
}