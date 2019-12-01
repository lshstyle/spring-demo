package com.example.spring.ioc.bean;
/**
*@author lsh
*@version V1.0
*@createTime 2019-11-26 22:37:23
*/
public class RainBow {

	private String name;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "RainBow [name=" + name + ", age=" + age + "]";
	}

	
}
