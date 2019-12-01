package com.example.spring.ioc.bean;
/**
*@author lsh
*@version V1.0
*@createTime 2019-11-26 21:45:59
*/
public enum Color {
	
	yellow("yellow", "黄色"),
	green("green", "绿色");
	
	private String key;
	private String value;
	
	Color(String key, String value) {
		this.key = key;
		this.value = value;
	}
}