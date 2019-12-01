package com.example.spring.ioc.config.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
*@author lsh
*@version V1.0
*自定义逻辑返回需要的组件
*@createTime 2019-11-26 21:45:00
*/

public class MyImportSelector implements ImportSelector {

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[]{"com.example.sping.ioc.bean.Color"};
	}

}
