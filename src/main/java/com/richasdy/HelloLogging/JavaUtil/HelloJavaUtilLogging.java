package com.richasdy.HelloLogging.JavaUtil;

import java.util.logging.Logger;

public class HelloJavaUtilLogging {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(HelloJavaUtilLogging.class.getName());

	public static void main(String[] args) {
		
		log.warning("Hello this is an warning messages");
		log.config("Hello this is an config messages");
		log.info("Hello this is an info messages");
		log.severe("Hello this is an severe messages");
		log.fine("Hello this is an fine messages");
		log.finer("Hello this is an finer messages");
		log.finest("Hello this is an finest messages");
		
	}

}
