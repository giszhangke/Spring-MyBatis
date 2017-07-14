package org.giszk.mapper;

import java.util.List;
import org.giszk.domain.Book;
import org.apache.ibatis.annotations.Select;

public interface BookMapper {
	/**
	 * 查询所有的图书
	 * @return 图书对象集合
	 */
	@Select("select * from tb_book ")
	List<Book> findAll();
}
