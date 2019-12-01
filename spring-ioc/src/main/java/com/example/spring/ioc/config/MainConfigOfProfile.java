package com.example.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.spring.ioc.bean.RainBow;

/**
*@author lsh
*@version V1.0
*@createTime 2019-12-01 09:43:29
*/
@Configuration
public class MainConfigOfProfile{

	@Profile("test")
	@Bean("rainBowTest")
	public RainBow rainBowTest() {
		RainBow rainBow = new RainBow();
		rainBow.setName("test");
		return rainBow;
	}
	
	@Profile("dev")
	@Bean("rainBowDev")
	public RainBow rainBowDev() {
		RainBow rainBow = new RainBow();
		rainBow.setName("dev");
		return rainBow;
	}
}
