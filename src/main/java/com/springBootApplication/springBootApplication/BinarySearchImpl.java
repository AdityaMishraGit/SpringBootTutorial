package com.springBootApplication.springBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//By default bean scope is  singleton in spring in spring 
public class BinarySearchImpl {
	
	@Autowired
private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int ar[],int numberToSearch)
	{
		
		
	   sortAlgorithm.sorting(ar);
		return 3;
	}
	

}
