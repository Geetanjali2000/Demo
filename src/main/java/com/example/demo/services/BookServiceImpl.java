package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookRepo;
	
	
	@Override
	public Book create(Book book) {
	
		return this.bookRepo.save(book);
		
		
	}

	@Override
	public List<Book> getAllBooks() {
		return this.bookRepo.findAll();
	}

	@Override
	public Book getBook(int bookId) {
		
		return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
	}

}
