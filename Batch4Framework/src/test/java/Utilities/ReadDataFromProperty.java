package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.constants;

public class ReadDataFromProperty {
	
	public static Properties readDatafromProperty() throws IOException
	{
		FileReader reader=new FileReader(constants.PROPERTYFILEPATH);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
		
	}
	
	
	

}
