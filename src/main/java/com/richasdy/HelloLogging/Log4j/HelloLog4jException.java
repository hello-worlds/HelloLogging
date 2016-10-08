package com.richasdy.HelloLogging.Log4j;

import org.apache.log4j.Logger;

public class HelloLog4jException {

	final static Logger log = Logger.getLogger(HelloLog4jException.class);

	public static void main(String[] args) {

		HelloLog4jException obj = new HelloLog4jException();

		try {
			obj.divide();
		} catch (ArithmeticException ex) {
			log.error("Sorry, something wrong!", ex);
		}

	}

	private void divide() {

		int i = 10 / 0;

	}

}
