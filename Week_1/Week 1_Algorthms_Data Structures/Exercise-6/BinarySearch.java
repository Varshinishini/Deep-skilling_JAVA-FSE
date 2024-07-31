package Library_Management_System;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Book binarySearch(Book[] books, String searchTerm) {
        // Sorting the array based on title
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books[mid];
            int comparison = midBook.getTitle().compareToIgnoreCase(searchTerm);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Not found
    }
}
