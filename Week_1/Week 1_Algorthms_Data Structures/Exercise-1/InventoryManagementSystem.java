package InventoryManagementSystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Update product
        product2.setPrice(450.00);
        inventory.updateProduct(product2);

        // Delete a product
        inventory.deleteProduct("P001");

        // Display all products
        inventory.displayProducts();
    }
}
