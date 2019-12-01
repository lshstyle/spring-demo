package com.example.spring.ioc.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-27 23:11:26
*/
@Component
public class Cat implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat destroy......");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat afterPropertiesSet......");
	}

}
