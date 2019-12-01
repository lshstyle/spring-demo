package com.example.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.ioc.bean.Car;
import com.example.spring.ioc.bean.Cat;
import com.example.spring.ioc.bean.Dog;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-26 23:08:00
*/
@Configuration
@ComponentScan("com.example.spring.ioc.bean")
public class MainConfigOfLifeCycle {

	//@Scope("prototype")
	@Bean(initMethod="init", destroyMethod="destroy")
	public Car car() {
		return new Car();
	}
	
}
