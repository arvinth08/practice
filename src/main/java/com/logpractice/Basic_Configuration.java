package com.logpractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	static Logger log = Logger.getLogger(Basic_Configuration.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}
}
