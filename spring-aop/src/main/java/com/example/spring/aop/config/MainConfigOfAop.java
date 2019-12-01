package com.example.spring.aop.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigOfAop {

	public int div(int i, int j) {
		return i/j;
	}
}
