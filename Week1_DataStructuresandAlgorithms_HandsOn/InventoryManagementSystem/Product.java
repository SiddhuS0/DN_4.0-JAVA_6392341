package InventoryManagementSystem;
//product class
public class Product {
    //attributes
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    //methods for operations
    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //displaying details of products
    public void display() {
        System.out.println("ID: "+ productId + ", Name: " + productName +", Quantity: " + quantity + ", Price: " + price);
    }
}
