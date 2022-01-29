package com.springBootApplication.springBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
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
