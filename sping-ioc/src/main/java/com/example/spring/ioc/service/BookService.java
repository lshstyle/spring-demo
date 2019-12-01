package com.example.spring.ioc.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring.ioc.dao.BookDao;

/**
*@author lsh
*@version V1.0
*@createTime 2019-11-10 10:30:54
*/
@Service
public class BookService {

	//@Qualifier("bookDao2")
	//@Autowired(required=false)
		
	//@Resource(name="bookDao2")
	@Inject
	private BookDao bookDao;
}
