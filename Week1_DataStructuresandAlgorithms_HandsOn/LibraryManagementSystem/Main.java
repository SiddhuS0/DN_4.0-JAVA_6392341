package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "abc", "Siddhu"),
            new Book(102, "def", "Ram"),
            new Book(103, "ghi", "Ashs"),
            new Book(104, "jkl", "Chai")
        };

        String searchTitle = "jkl";

        //linear search
        int lidx = Library.linearSearch(books, searchTitle);
        System.out.println("Linear Search:");
        if (lidx != -1) books[lidx].display();
        else System.out.println("Book not found");

        //sorting for bs
        Library.sortBooksByTitle(books);

        //binary search
        int bidx = Library.binarySearch(books, searchTitle);
        System.out.println("\nBinary Search:");
        if (bidx != -1) books[bidx].display();
        else System.out.println("Book not found");
    }
}
