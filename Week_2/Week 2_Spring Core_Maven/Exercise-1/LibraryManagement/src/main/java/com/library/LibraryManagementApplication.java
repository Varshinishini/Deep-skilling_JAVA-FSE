package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the BookService bean from the context
        BookService bookService = context.getBean(BookService.class);
        
        // Test the configuration
        bookService.addBook("The Great Gatsby");
        bookService.getBooks();
        
        // Retrieve BookRepository bean and use it
        com.library.repository.BookRepository bookRepository = context.getBean(com.library.repository.BookRepository.class);
        bookRepository.saveBook("The Great Gatsby");
        bookRepository.fetchAllBooks();
    }
}
