package EcommercePlatformSearchFunction;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "CricketBat", "Sports")
        };

        String key = "CricketBat";

        //linear search
        int lidx = Search.linearSearch(products, key);
        System.out.println("Linear Search:");
        if (lidx != -1) products[lidx].display();
        else System.out.println("Product not found.");

        // Binary Search (requires sorting first)
        Search.sortProductsByName(products);
        int bidx = Search.binarySearch(products, key);
        System.out.println("Binary Search:");
        if (bidx != -1) products[bidx].display();
        else System.out.println("Product not found.");
    }
}
