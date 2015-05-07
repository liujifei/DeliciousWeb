package com.delicious.service;

import org.springframework.stereotype.Component;

import com.delicious.model.Book;

@Component
public interface BookService {
	public void add(Book book);
	public void update(Book book);
}
