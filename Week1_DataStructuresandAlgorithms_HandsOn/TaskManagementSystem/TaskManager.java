package TaskManagementSystem;

public class TaskManager {
    private Node head;

    //adding task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head==null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added");
    }
    //searching
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp!=null) {
            if (temp.task.getTaskId()==taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    //deleting
    public void deleteTask(int taskId) {
        if (head==null) {
            System.out.println("Task list is empty");
            return;
        }
        if (head.task.getTaskId()==taskId) {
            head = head.next;
            System.out.println("Task deleted");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current!=null && current.task.getTaskId()!=taskId) {
            prev = current;
            current = current.next;
        }
        if (current!=null) {
            prev.next = current.next;
            System.out.println("Task deleted");
        } else {
            System.out.println("Task not found");
        }
    }
    //displaying
    public void displayTasks() {
        Node temp = head;
        if (temp==null) {
            System.out.println("No tasks in the list");
            return;
        }
        while (temp!=null) {
            temp.task.display();
            temp = temp.next;
        }}}
