package org.giszk.service;

import java.util.List;
import org.giszk.domain.Book;

/**
 * Book服务层接口
 * @author zhangke
 *
 */
public interface BookService {
	/**
	 * 查找所有的图书
	 * @return Book对象集合
	 */
	List<Book> getAll();
}
