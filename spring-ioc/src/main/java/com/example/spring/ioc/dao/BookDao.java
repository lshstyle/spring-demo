package com.example.spring.ioc.dao;

import org.springframework.stereotype.Repository;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-10 10:30:27
*/
@Repository
public class BookDao {
	
	private String label = "1";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public String toString() {
		return "BookDao[label="+label+"]";
	}
	
	
}
