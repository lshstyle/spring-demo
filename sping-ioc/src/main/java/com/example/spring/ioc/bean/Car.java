package com.example.spring.ioc.bean;

import org.springframework.stereotype.Component;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-27 22:32:40
*/
public class Car{
	
	public Car() {
		System.out.println("car construct....");
	} 
	
	public void init() {
		System.out.println("car init....");
	}
	
	public void destroy() {
		System.out.println("car destroy....");
	}

}
