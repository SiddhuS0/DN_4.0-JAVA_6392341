package ProxyPatternExample;

//Main.java
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("my_photo.jpg");

        System.out.println("First call to display():");
        image1.display();  //load from remote and display

        System.out.println("\nSecond call to display():");
        image1.display();  //use cached image and display
    }
}
