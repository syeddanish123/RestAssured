package com.hrms.log4j;

import org.apache.log4j.Logger;

public class Log {

	private final static Logger Log=Logger.getLogger(Log.class.getName());
	
	public static void info(String message) 
	{
		
		Log.info(message);
		
	}
}
