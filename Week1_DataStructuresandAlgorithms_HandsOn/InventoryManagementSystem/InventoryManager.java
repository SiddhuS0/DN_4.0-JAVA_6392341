package InventoryManagementSystem;
import java.util.*;
//managing the inventory
public class InventoryManager {
    //data structure of managing products
    private HashMap<Integer, Product> inventory = new HashMap<>();
    //adding
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully");
    }
    //updating
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product Updated Sucessfully");
        } else {
            System.out.println("Product Not Found!");
        }
    }
    //deleting
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product Removed Successfully");
        } else {
            System.out.println("Product Not Found!");
        }
    }
    //displaying
    public void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (Product p : inventory.values()) {
            p.display();
        }
    }
}

