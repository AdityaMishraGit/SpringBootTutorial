package com.springBootApplication.springBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BinarySearch {
	
	@Autowired
private Sort sort;
	
	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public int binarySearch()
	{
	   
		return 3;
	}
	

}
