package report;

import org.apache.log4j.Logger;

public class SampleReport {
	static Logger logger=Logger.getLogger(SampleReport.class);
	
	public void generateReport()
	{
	logger.debug("SampleReport debug message");
	logger.info("SampleReport info message");
	logger.warn("SampleReport warn message");
	logger.error("SampleReport error message");
	logger.fatal("SampleReport fatal message");
		
	}

}
