package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Library {

    //linear search by title
    public static int linearSearch(Book[] books, String title) {
        for (int i=0; i<books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    //binary search by title
    public static int binarySearch(Book[] books, String title) {
        int low = 0;
        int high = books.length-1;
        while (low<=high) {
            int mid = (low+high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp==0) return mid;
            else if (cmp<0) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    //sorting books by title for bs
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}
