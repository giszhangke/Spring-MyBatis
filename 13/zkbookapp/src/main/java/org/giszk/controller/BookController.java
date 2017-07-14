package org.giszk.controller;

import java.util.List;
import org.giszk.domain.Book;
import org.giszk.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * 处理图书请求控制器
 */
@Controller
public class BookController {
	/**
	 * 自动注入BookService
	 */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理/main请求
	 */
	@RequestMapping(value = "/main")
	public String main(Model model) {
		List<Book> book_list = bookService.getAll();
		model.addAttribute("book_list", book_list);
		return "main";
	}
}
