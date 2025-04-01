package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.entities.BookInput;
import com.example.demo.services.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	//create
	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setAuthor(book.getAuthor());
		b.setName(book.getName());
		b.setPrice(book.getPrice());
		b.setPages(book.getPages());
		return this.bookService.create(b);
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
