package com.practice.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\91978\\eclipse-workspace\\Adactin_Booking\\src\\main\\java\\com\\practice\\property\\configuratoin.properties");

		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);

	}
	
	public String get_Config_Url()
	{
		String value = p.getProperty("url");
		
		return value;
	}
}
