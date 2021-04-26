package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	
	Book findBook(long id);

	boolean deleteBook(long id);

	boolean updateBook(Book book);

	boolean addBook(Book book);

	List<Book> findAllBooks();


}
