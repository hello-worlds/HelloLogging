package com.richasdy.HelloLogging.CommonLogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.apache.commons.logging.impl.Log4JLogger;

public class HelloCommonLogging {

	final static Log log = LogFactory.getLog(HelloCommonLogging.class);

	// tidak perlu dengan ini
	// final static Log4JLogger log = (Log4JLogger)
	// LogFactory.getLog(HelloCommonLogging.class);

	public static void main(String[] args) {

		HelloCommonLogging obj = new HelloCommonLogging();
		obj.runMe("richasdy");

	}

	private void runMe(String parameter) {

		// log.setLevel(Level.WARN);

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
