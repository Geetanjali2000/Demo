package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;

@SpringBootApplication
public class GraphqldemoApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}

	
}
