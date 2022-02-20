	package com.springBootApplication.springBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springBootApplication.springBootApplication.basic.BinarySearchImpl;
import com.springBootApplication.springBootApplication.scope.PersonDao;

@SpringBootApplication
public class Application {
 
	
	private static Logger LOGGER=LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext=SpringApplication.run(Application.class, args);//Run method Actually returns the application context
		
		BinarySearchImpl binarySearchImpl=applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl.binarySearch(new int[]{1,2,3,4,5,6}, 3));	
		
		PersonDao personDao=applicationContext.getBean(PersonDao.class);
		LOGGER.info("this is the log{}",binarySearchImpl);
		LOGGER.info("this is the log{}",personDao);
		 
	}

}
