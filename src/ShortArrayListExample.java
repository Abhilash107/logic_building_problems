import java.util.ArrayList;

public class ShortArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        // Iterating over the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // Getting the size of the list
        System.out.println("Number of fruits: " + fruits.size());
    }
}
