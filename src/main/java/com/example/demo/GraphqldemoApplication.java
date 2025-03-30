package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;

@SpringBootApplication
public class GraphqldemoApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setName("Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("ABC");
		
		Book b2 = new Book();
		b2.setTitle("Complete Reference");
		b2.setName("Java");
		b2.setPages(2000);
		b2.setPrice(5000);
		b2.setAuthor("PQR");
		
		
		Book b3 = new Book();
		b3.setTitle("Complete Python");
		b3.setName("Python");
		b3.setPages(2000);
		b3.setPrice(5000);
		b3.setAuthor("XYZ");
		
		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
	
	

}
