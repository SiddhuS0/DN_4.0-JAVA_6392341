import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager(10);
        int choice;
        //using dowhile
        do {
            System.out.println("\nWELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("\n1. Add Employee\n2. Search Employee\n3. Delete Employee\n4. Display All\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            //switch case for choosing opts
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Position, Salary: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String pos = sc.next();
                    double salary = sc.nextDouble();
                    manager.addEmployee(new Employee(id, name, pos, salary));
                    break;
                case 2:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    Employee emp = manager.searchEmployee(sid);
                    if (emp != null) emp.display();
                    else System.out.println("Employee not found.");
                    break;
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int did = sc.nextInt();
                    manager.deleteEmployee(did);
                    break;
                case 4:
                    manager.displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    sc.close();
    }
}
