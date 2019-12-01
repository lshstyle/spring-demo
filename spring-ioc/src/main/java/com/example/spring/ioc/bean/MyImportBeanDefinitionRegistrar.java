package com.example.spring.ioc.bean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-26 22:30:11
*/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
		registry.registerBeanDefinition("rainBow", beanDefinition);
	}

}
