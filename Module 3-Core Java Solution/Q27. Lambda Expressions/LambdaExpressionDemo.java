import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original List:");
        System.out.println(fruits);

        // Sort using lambda expression
        Collections.sort(fruits, (a, b) -> a.compareTo(b));

        System.out.println("\nSorted List:");
        System.out.println(fruits);
    }
}
