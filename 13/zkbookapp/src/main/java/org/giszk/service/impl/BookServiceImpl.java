package org.giszk.service.impl;

import java.util.List;

import org.giszk.domain.Book;
import org.giszk.service.BookService;
import org.giszk.mapper.BookMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Isolation;

/**
 * Book服务层接口的实现类
 * @Service("bookService")用户将当前注释为一个Spring的bean, 名为bookService
 * @author zhangke
 *
 */
@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
@Service("bookService")
public class BookServiceImpl implements BookService {
	/**
	 * 自动注入BookMapper
	 */
	@Autowired
	private BookMapper bookMapper;
	
	/**
	 * BookService接口的getAll方法实现
	 * @see { BookService }
	 */
	@Transactional(readOnly=true)
	public List<Book> getAll() {
		return bookMapper.findAll();
	}

}
