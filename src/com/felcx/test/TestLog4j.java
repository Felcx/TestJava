package com.felcx.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.felcx.interfaces.IBaseExcute;

public class TestLog4j implements IBaseExcute{
	private static final Logger logger=LogManager.getLogger(TestLog4j.class);

	@Override
	public void excuter() {
		 logger.trace("Entering application.");
	        Bar bar = new Bar();
	        if (!bar.doIt()) {
	            logger.error("Didn't do it.");
	        }
	        logger.trace("Exiting application.");
	}
}
class Bar {
	  static final Logger logger = LogManager.getLogger(Bar.class.getName());
	 
	  public boolean doIt() {
	    logger.entry();
	    logger.error("Did it again!");
	    return logger.exit(false);
	  }
	}
