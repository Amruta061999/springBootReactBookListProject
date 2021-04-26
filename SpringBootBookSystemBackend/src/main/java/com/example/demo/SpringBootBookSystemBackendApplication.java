package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;

@SpringBootApplication
public class SpringBootBookSystemBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookSystemBackendApplication.class, args);
	}
	
	@Autowired
	BookRepository bookRepository;

	public void run(String...args)throws Exception{
		bookRepository.save(new Book("An Autobiography","Jawaharlal Nehru"));
		bookRepository.save(new Book("An idealist View of Life","Dr.S. Radhakrishnan"));
		bookRepository.save(new Book("Arion and the Dolphin","Vikram Seth"));
		bookRepository.save(new Book("Arthashastra","Kautilya"));
		bookRepository.save(new Book("A Revolutionary Life","Laxmi Sehgal"));
	}
}
