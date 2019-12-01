package com.example.spring.ioc.bean;
/**
*@author lsh
*@version V1.0
*@createTime 2019-11-27 23:23:46
*/

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	
	
	public Dog() {
		System.out.println(" Dog construct .....");
	}
	@PostConstruct
	public void init() {
		System.out.println("PostConstruct ......");
	}
	
	@PreDestroy
	public void distroy() {
		System.out.println("PreDestroy ....");
	}

}
