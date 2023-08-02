package Bootcamp.Day7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	void addEmployee() {
		
		logger.error("This is error");
		logger.warn("This is warning");
		logger.info("This is info");
		logger.debug("This is debug");
		
	}
	
}
