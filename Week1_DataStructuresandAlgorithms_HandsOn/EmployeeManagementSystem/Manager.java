public class Manager {
    private Employee[] employees;
    private int size;

    public Manager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    //adding
    public void addEmployee(Employee emp) {
        if (size<employees.length) {
            employees[size++] = emp;
            System.out.println("Employee Added");
        } else {
            System.out.println("Employee Capacity is full");
        }
    }
    //searching
    public Employee searchEmployee(int id) {
        for (int i=0; i<size; i++) {
            if (employees[i].getEmployeeId()==id) {
                return employees[i];
            }
        }
        return null;
    }
    //deleting
    public void deleteEmployee(int id) {
        for (int i=0; i<size; i++) {
            if (employees[i].getEmployeeId() == id) {
                // Shift elements to the left
                for (int j=i; j<size-1; j++) {
                    employees[j] = employees[j+1];
                }
                employees[size-1] = null;
                size--;
                System.out.println("Employee removed");
                return;
            }
        }
        System.out.println("Employee not found");
    }

    //displaying
    public void displayAllEmployees() {
        if (size==0) {
            System.out.println("No employee records found.");
        } else {
            for (int i=0; i<size; i++) {
                employees[i].display();
            }
        }
    }
}
