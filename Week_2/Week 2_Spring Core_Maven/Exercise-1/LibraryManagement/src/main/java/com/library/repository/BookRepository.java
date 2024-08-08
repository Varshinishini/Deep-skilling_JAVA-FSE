package com.library.repository;

public class BookRepository {
    
    public void saveBook(String title) {
        System.out.println("Saving book: " + title);
    }
    
    public void fetchAllBooks() {
        System.out.println("Fetching all books from repository.");
    }
}
