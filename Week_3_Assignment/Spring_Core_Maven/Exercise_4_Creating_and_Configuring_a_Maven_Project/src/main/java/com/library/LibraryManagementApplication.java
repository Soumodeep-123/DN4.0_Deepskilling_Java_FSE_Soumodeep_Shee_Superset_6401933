package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.Service.BookService;




public class LibraryManagementApplication {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class); 
        bookService.issueBook();
        
        


    }
}