package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("//booklist")
	public List<Book> listOfBooks(){
		return bookRepository.findAll();
	}
	/*
	//create book rest API
	@PostMapping("//booklist")
	public List<Book> addBook(@RequestBody Book book) {
		System.out.println("In add Book " + book);
		bookRepository.addBook(book);
		return bookRepository.findAllBooks();
	}
	*/	
	
}
