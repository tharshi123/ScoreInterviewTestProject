package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	static FileInputStream oFile;
	
	public static String getPropertyValue(String sFileName, String sKey) {
		//String sFile = "./data/Environment_Details.properties";
		String sFile = "./src/test/resources/data/"+sFileName+".properties";
		String sValue = null;
		try {
			oFile = new FileInputStream(sFile);
			Properties oProp = new Properties();
			oProp.load(oFile);
			sValue= oProp.getProperty(sKey);
			System.out.println("*****"+sValue);
			return sValue;
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sValue);
		return sValue;
	}

}
