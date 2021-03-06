package com.logpractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	
	static Logger log = Logger.getLogger(Property_Configuration.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}

}
