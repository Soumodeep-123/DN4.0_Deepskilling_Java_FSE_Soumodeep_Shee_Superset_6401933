package com.library.Service;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void issueBook(){
        System.out.println("Book issued");
        bookRepository.getBook();
    }
    
    public void display() {
    	System.out.println("Service available");
    }
}
