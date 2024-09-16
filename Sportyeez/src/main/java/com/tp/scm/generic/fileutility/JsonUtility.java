package com.tp.scm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author MINIT SINGH
 */
public class JsonUtility {

	/**
	 * 
	 * @param key
	 * @return data string type
	 * @throws IOException
	 * @throws ParseException
	 */
	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		FileReader fileR = new FileReader("./configAppData/commonDataJson.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fileR);
		JSONObject map = (JSONObject) obj;
		String data = (String) map.get(key);
		return data;
	}

}
