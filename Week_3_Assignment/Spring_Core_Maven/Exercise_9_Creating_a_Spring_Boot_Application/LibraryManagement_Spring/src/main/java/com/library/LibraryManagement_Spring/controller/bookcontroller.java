package com.library.LibraryManagement_Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.LibraryManagement_Spring.repository.BookRepository;
import com.library.LibraryManagement_Spring.entity.book;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/book")
public class bookcontroller {
	
	@Autowired
    private BookRepository bookRepository;
	
	@GetMapping
	public List<book> getAllBooks() {
	    return bookRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<book> getBookById(@PathVariable Long id) {
	    return bookRepository.findById(id)
	            .map(Book -> ResponseEntity.ok(Book))
	            .orElse(ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public book addBook(@RequestBody book Book) {
	    return bookRepository.save(Book);
	}


	
	
}
