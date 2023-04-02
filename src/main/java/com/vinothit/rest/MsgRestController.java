package com.vinothit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	
	private Logger logger=LoggerFactory.getLogger(MsgRestController.class);
	
	
	@GetMapping("/")
	public String getWelcomeMsg() {
		
		// Secondary Logic Logger Level...
		logger.debug("This is debug message from getWelcomeMsg() method...");
		logger.info("getWelcomeMsg() started...");
		logger.warn("this warning message from getWelcomeMsg()");
		
	    try {
			int i=10/0;
		} catch (Exception e) {
			logger.error("Exception Occured :: " + e.getMessage());
		}
		
	    // Business Logic 
		String msg = "Welcome to Vinoth IT...";
		
		logger.info("getWelcomeMsg() ended...");
		
		return msg;
		
	}

}
