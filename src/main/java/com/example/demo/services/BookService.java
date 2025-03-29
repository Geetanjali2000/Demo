package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;


public interface BookService {

	//Create Book
	Book create(Book book);
	
	//Get All Book
	List<Book> getAllBooks();
	
	//Get Single Book
	Book getBook(int bookId);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
