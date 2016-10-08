package com.richasdy.HelloLogging.Log4j;

import org.apache.log4j.Logger;

public class HelloLog4j {

	final static Logger log = Logger.getLogger(HelloLog4j.class);

	public static void main(String[] args) {

		HelloLog4j obj = new HelloLog4j();
		obj.runMe("richasdy");

	}

	private void runMe(String parameter) {
		
		
		if (log.isTraceEnabled()) {
			log.trace("This is trace : " + parameter);
		}
		
		if (log.isDebugEnabled()) {
			log.debug("This is debug : " + parameter);
		}

		if (log.isInfoEnabled()) {
			log.info("This is info : " + parameter);
		}
		
		
		log.warn("This is warn : " + parameter);
		log.error("This is error : " + parameter);
		log.fatal("This is fatal : " + parameter);
		

	}

}
