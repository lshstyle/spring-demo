package com.example.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

import com.example.spring.ioc.bean.Color;
import com.example.spring.ioc.bean.MyImportBeanDefinitionRegistrar;
import com.example.spring.ioc.bean.Person;
import com.example.spring.ioc.config.filter.MyTypeFilter;
import com.example.spring.ioc.config.selector.MyImportSelector;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-10 09:02:36
*/
@Configuration 

/*扫描controller service repository component
@ComponentScan(value="com.example", 
               //excludeFilters={@Filter(type=FilterType.ANNOTATION, classes= {Controller.class})},
                 includeFilters= {@Filter(type=FilterType.ANNOTATION, classes= {Service.class})},useDefaultFilters=false   
)*/
/*按注解类
@ComponentScans(value= {
		@ComponentScan(value="com.example", 
	                 includeFilters= {@Filter(type=FilterType.ANNOTATION, classes= {Service.class})},useDefaultFilters=false
	                 )
})*/
/*按类型
@ComponentScans(value= {
		@ComponentScan(value="com.example", 
	                 includeFilters= {@Filter(type=FilterType.ASSIGNABLE_TYPE, classes= {BookService.class})},useDefaultFilters=false
	                 )
})*/
/*自定义*/
/*
@ComponentScans(value= {
		@ComponentScan(value="com.example", 
	                 includeFilters= {@Filter(type=FilterType.CUSTOM, classes= {MyTypeFilter.class})},useDefaultFilters=false
	                 )
})*/
/**
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
**/
public class MainConfig {

	//给容器中注册一个bean;类型为返回值的类型，id默认是用方法名作为id
	@Bean
	public Person person() {
		return new Person("张三", 20);
	}
}
