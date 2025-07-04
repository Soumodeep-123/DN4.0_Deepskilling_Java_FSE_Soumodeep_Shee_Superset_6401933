package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository

public class BookRepository {
    public BookRepository() {
        System.out.println("BookRepository created");
    }
    
    public void getBook() {
        System.out.println(" Fetching book from repository...");
    }
}
