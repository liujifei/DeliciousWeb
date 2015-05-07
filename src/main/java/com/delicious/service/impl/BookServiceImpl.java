package com.delicious.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.delicious.dao.BookDao;
import com.delicious.model.Book;
import com.delicious.service.BookService;

@Component
public class BookServiceImpl implements BookService {
	  private BookDao bookDao;

	  public BookDao getBookDao() {
	    return bookDao;
	  }

	  @Resource
	  public void setBookDao(BookDao bookDao) {
	    this.bookDao = bookDao;
	  }
	  
	  public void add(Book book){
	    bookDao.add(book);
	  }
	  public void update(Book book){
	    bookDao.update(book);
	  }
	  

}
