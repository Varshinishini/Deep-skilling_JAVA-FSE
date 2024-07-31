package Library_Management_System;

public class LinearSearch {
    public static Book linearSearch(Book[] books, String searchTerm) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTerm) ||
                book.getAuthor().equalsIgnoreCase(searchTerm)) {
                return book;
            }
        }
        return null; // Not found
    }
}
