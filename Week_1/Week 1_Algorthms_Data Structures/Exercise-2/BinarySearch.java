package E_commerce_Platform;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String searchTerm) {
        // Sorting the array based on productId
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products[mid];
            int comparison = midProduct.getProductId().compareTo(searchTerm);

            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Not found
    }
}