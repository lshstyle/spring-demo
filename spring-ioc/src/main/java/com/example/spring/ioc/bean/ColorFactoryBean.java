package com.example.spring.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-26 22:52:35
*/
public class ColorFactoryBean implements FactoryBean<Color> {
	
	//返回一个Color对象，这个对象会添加到容器
	
	public Color getObject() throws Exception {
		// TODO Auto-generated method stub
		return Color.yellow;
	}
	

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Color.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
