package com.library.service;

public class BookService {
    
    public void addBook(String title) {
        System.out.println("Book added: " + title);
    }
    
    public void getBooks() {
        System.out.println("Fetching all books.");
    }
}
