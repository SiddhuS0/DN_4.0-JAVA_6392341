package SortingCustomerOrders;

public class Order {
    //attributes
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    //ops
    public double getTotalPrice() {
        return totalPrice;
    }
    public void display() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Total: " + totalPrice);
    }
    

}
