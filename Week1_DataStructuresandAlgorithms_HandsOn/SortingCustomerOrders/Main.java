package SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        // for bubble sort
        Order[] orders = {
            new Order(1, "Siddhu", 7070),
            new Order(2, "Ram", 800),
            new Order(3, "Ashs", 2400),
            new Order(4, "Chai", 1500)
        };
        System.out.println("Before Sorting Orders:");
        for (Order o : orders) o.display();

        //bubble sort
        Sort.bubbleSort(orders);
        System.out.println("\nBubble Sort:");
        for (Order o : orders) o.display();

        //for quick sort
        orders = new Order[]{
            new Order(1, "Siddhu", 7070),
            new Order(2, "Ram", 800),
            new Order(3, "Ashs", 2400),
            new Order(4, "Chai", 1500)
        };

        //quick sort
        Sort.quickSort(orders, 0, orders.length-1);
        System.out.println("\nQuick Sort:");
        for (Order o : orders) o.display();
    }
}
