package com.example.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author lsh
 * @version V1.0
 * @createTime 2019-11-10 08:54:46
 */
public class Person {

	@Value("${person.name}")
	private String name;

	@Value("#{30-9}")
	private Integer age;

	@Value("男")
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(String name, Integer age) {
		super();
		System.out.println("开始构造 Person bean......");
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex +"]";
	}

}
