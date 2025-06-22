package InventoryManagementSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        //using dowhile
        do {
            System.out.println("\nINENTORY MANAGEMENT SYSTEM");
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Display Products\n5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            //switchcase for choosing the ops
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int qty = sc.nextInt();
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new Name, Quantity, Price: ");
                    String uname = sc.next();
                    int uqty = sc.nextInt();
                    double uprice = sc.nextDouble();
                    manager.updateProduct(uid, uname, uqty, uprice);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteProduct(did);
                    break;
                case 4:
                    manager.displayAllProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
