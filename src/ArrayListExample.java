import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add(1, "Inserted Element"); // Adding element at specific index

        // Accessing elements
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));

        // Iterating over the list using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        // Iterating over the list using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing elements
        list.remove("Element2"); // Removing a specific element
        list.remove(1); // Removing element at a specific index

        // Iterating after removal
        System.out.println("List after removal:");
        for (String element : list) {
            System.out.println(element);
        }

        // Other useful methods
        System.out.println("List contains 'Element1': " + list.contains("Element1"));
        System.out.println("List size: " + list.size());
        list.clear();
        System.out.println("List size after clear: " + list.size());
    }
}

