package com.example.spring.ioc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.spring.ioc.dao.BookDao;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-30 09:28:34
*/
@Configuration
@ComponentScan({"com.example.spring.ioc.controler"})
public class MainConfigOfAutowire {

	
	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		 BookDao bookDao = new BookDao();
		 bookDao.setLabel("2");
		 return bookDao;
	}
	
}
