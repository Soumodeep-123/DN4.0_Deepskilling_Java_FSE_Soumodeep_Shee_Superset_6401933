package com.library.Service;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
    private BookRepository bookRepository;
    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void issueBook(){
        System.out.println("Book issued");
        bookRepository.getBook();
    }
}
