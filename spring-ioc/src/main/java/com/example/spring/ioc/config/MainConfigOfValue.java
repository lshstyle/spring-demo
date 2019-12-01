package com.example.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.spring.ioc.bean.Person;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-30 08:46:47
*/
@Configuration
@PropertySource(value= {"classpath:/person.properties"})
public class MainConfigOfValue {

	@Bean
	public Person person() {
		return new Person();
	}
}
