package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	//create
	@PostMapping("createBook")
	public Book createBook(@RequestBody Book book) {
		
		return this.bookService.create(book);
	}
	
	//GetAllBooks
	@QueryMapping("allBooks")
	public List<Book> getAllBooks(){
		return this.bookService.getAllBooks();
	}
	
	//Get Single book
	@QueryMapping("getBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return this.bookService.getBook(bookId);
	}
}
