import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements
        list.add("A");
        list.add("B");
        list.add(1, "C");
        list.addFirst("First");
        list.addLast("Last");
        
        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));
        
        // Removing elements
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        
        // Iterating over the list
        System.out.println("List elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Using an iterator
        System.out.println("List elements using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Other operations
        System.out.println("List contains 'A': " + list.contains("A"));
        System.out.println("List size: " + list.size());
        
        // Clearing the list
        list.clear();
        System.out.println("List size after clear: " + list.size());
    }
}
