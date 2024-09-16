package com.tp.scm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author MINIT SINGH
 */

public class FileUtility {

	/**
	 * This method is to fetch data from properties file
	 * 
	 * @param key
	 * @return data
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./configAppData/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);
		return data;

	}

}
