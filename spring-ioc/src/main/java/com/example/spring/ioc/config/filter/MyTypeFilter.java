package com.example.spring.ioc.config.filter;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * @author lsh
 * @version V1.0
 * @createTime 2019-11-16 10:51:00
 */
public class MyTypeFilter implements TypeFilter {

	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// TODO Auto-generated method stub
		// 获取当前注解类的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

		// 获取当前正在扫描类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		// 获取当前类的资源信息
		Resource resource = metadataReader.getResource();
		String className = classMetadata.getClassName();
		if (className.contains("BookService")) {
			return true;
		}
		System.out.println("-->" + className);
		return false;
	}
}
