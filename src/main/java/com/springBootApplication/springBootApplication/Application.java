	package com.springBootApplication.springBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext=SpringApplication.run(Application.class, args);//Run method Actually returns the application context
		
		BinarySearchImpl binarySearchImpl=applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl.binarySearch(new int[]{1,2,3,4,5,6}, 3));	
		
		System.out.println(binarySearchImpl.hashCode());
	}

}
