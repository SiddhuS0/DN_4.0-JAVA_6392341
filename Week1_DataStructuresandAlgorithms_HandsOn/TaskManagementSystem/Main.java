package TaskManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice;
        //using dowhile
        do {
            System.out.println("WELCOME TO TASK MANAGEMENT SYSTEM");
            System.out.println("\n1. Add Task\n2. Search Task\n3. Delete Task\n4. Display All\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            // switch for opts
            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID, Name, Status: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String status = sc.next();
                    manager.addTask(new Task(id, name, status));
                    break;
                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int sid = sc.nextInt();
                    Task t = manager.searchTask(sid);
                    if (t!=null) t.display();
                    else System.out.println("Task not found.");
                    break;
                case 3:
                    System.out.print("Enter Task ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteTask(did);
                    break;
                case 4:
                    manager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exited.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice!=5);
    sc.close();
    }
}
