package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import report.SampleReport;

public class SampleAdmin {
	static Logger logger=Logger.getLogger(SampleAdmin.class);
	
	 public static void main(String[] args) {
		 
		 PropertyConfigurator.configure("log4j.properties");
		 logger.debug("SampleAdmin debug message");
		 logger.info("SampleAdmin infomessage");
		logger.warn("SampleAdmin warn message");
		logger.error("SampleAdmin error message");
		logger.fatal("SampleAdmin fatal message");
		
		SampleReport sr=new SampleReport();
		sr.generateReport();
		
	}
	

}
