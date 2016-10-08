package com.richasdy.HelloLogging.Log4j;

import org.apache.log4j.Logger;

public class HelloLog4j {

	final static Logger logger = Logger.getLogger(HelloLog4j.class);

	public static void main(String[] args) {

		HelloLog4j obj = new HelloLog4j();
		obj.runMe("richasdy");

	}

	private void runMe(String parameter) {
		
		
		if (logger.isTraceEnabled()) {
			logger.trace("This is trace : " + parameter);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}
		
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		

	}

}
