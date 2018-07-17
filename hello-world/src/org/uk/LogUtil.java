package org.uk;

import org.apache.log4j.Logger;

public class LogUtil {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(LogUtil.class);
		
		System.out.println("Logger writing into file...");
		logger.info("This is information");
		logger.warn("This is warning");
		logger.error("This is error");
		logger.debug("This is debug");
		logger.fatal("This is fatal");
	}
}
