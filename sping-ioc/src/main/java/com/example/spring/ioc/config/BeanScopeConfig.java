package com.example.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.example.spring.ioc.bean.Person;
import com.example.spring.ioc.config.condition.LinuxCondition;
import com.example.spring.ioc.config.condition.WindowsCondition;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-18 20:55:55
*/

@Configuration
public class BeanScopeConfig {
	
	/*@Scope("prototype")*/ //原子性 
	/*@Scope("singleton")*/ //单实例
	/*@Scope("prototype")*/
	/*@Lazy //对于单实例而言，在程序启动时候，不创建对象，在对象加载的时候创建对象。而原子性相当于懒加载模式
	@Bean
	public Person person() {
		return new Person("li" ,25);
	}*/
	
	@Conditional({WindowsCondition.class})
	@Bean("windows")
	public Person windows() {
		return new Person("windows", 30);
	}
	
	@Conditional({LinuxCondition.class})
	@Bean("linux")
	public Person linux() {
		return new Person("linux", 50);
	}
}
