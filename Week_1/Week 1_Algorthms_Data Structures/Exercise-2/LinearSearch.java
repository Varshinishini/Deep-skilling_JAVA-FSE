package E_commerce_Platform;

public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchTerm) {
        for (Product product : products) {
            if (product.getProductId().equals(searchTerm) ||
                product.getProductName().equalsIgnoreCase(searchTerm) ||
                product.getCategory().equalsIgnoreCase(searchTerm)) {
                return product;
            }
        }
        return null; // Not found
    }
}
