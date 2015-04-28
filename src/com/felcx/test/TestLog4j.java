package com.felcx.test;

import org.apache.log4j.Logger;

import com.felcx.interfaces.IBaseExcute;

public class TestLog4j implements IBaseExcute{
	private static Logger logger=Logger.getLogger(TestLog4j.class);

	@Override
	public void excuter() {
		// TODO Auto-generated method stub
		logger.debug("it a debug message");
    	logger.warn("it is a warnning message");
    	logger.error("it is a error message");
	}
}
