package EcommercePlatformSearchFunction;

import java.util.*;

public class Search{
    //linear search by name
    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    //binary search by name (on sorted array)
    public static int binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(name);
            if (compare == 0) return mid;
            else if (compare < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    //sorting array for bs
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}

