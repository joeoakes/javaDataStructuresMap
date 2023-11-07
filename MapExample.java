import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
HashMap does not maintain the order of its elements
LinkedHashMap maintains the order of its entries
TreeMap sorted by its keys
 */

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        //Map<String, Integer> userAges = new HashMap<>();
        Map<String, Integer> userAges = new LinkedHashMap<>(); //maintains the order
        //Map<String, Integer> userAges = new TreeMap<>(); //Sorted

        // Add key-value pairs to the HashMap
        userAges.put("Alice", 28);
        userAges.put("Bob", 24);
        userAges.put("Joe", 44);
        userAges.put("Charlie", 33);

        // Retrieve the age of 'Bob'
        System.out.println("Bob's Age: " + userAges.get("Bob"));

        // Iterate over the entries in the map
        for (Map.Entry<String, Integer> entry : userAges.entrySet()) {
            String user = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(user + " is " + age + " years old.");
        }

        // Check if a key exists in the map
        if (userAges.containsKey("Alice")) {
            System.out.println("Alice is in the map.");
        }

        // Check if a value exists in the map
        if (userAges.containsValue(33)) {
            System.out.println("There is a user who is 33 years old.");
        }

        // Remove a key-value pair
        userAges.remove("Charlie");
        System.out.println("Charlie has been removed from the map.");

        // Replace a value associated with a key
        userAges.put("Alice", 29);
        System.out.println("Alice's new age is " + userAges.get("Alice"));

        // Find the size of the map
        int size = userAges.size();
        System.out.println("The map contains " + size + " entries.");
    }
}

