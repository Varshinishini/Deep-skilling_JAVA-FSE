package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book - " + title);
        bookRepository.saveBook(title);
    }

    public void getBooks() {
        System.out.println("BookService: Fetching all books.");
        bookRepository.fetchAllBooks();
    }
}
