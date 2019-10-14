// Creating a HashMap and Adding key-value pairs to it

//The following example shows how to create a HashMap, and add new key-value pairs to it.

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);
    }
}

