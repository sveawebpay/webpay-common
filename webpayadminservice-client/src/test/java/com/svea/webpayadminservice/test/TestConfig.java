package com.svea.webpayadminservice.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Class that handles test properties
 * 
 * @author Daniel Tamm
 *
 */
public class TestConfig {

	public static Logger testLogger = Logger.getLogger("com.svea.webpayadminservice.test");
	
	public static String	clientUsername;
	public static String	clientPassword;
	
	public static String	CONFIG_FILE = "test-config.properties";
	
	static {
		
		// Check if the file is there
		URL url = ClassLoader.getSystemResource(CONFIG_FILE);
		
		if (url!=null) {
			Properties props = new Properties();
			try {
				props.load(new FileReader(url.getFile()));
				
				clientUsername = props.getProperty("clientUsername");
				clientPassword = props.getProperty("clientPassword");
				
			} catch (FileNotFoundException e) {
				testLogger.severe("No test-config.properties file found in classpath / path");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
