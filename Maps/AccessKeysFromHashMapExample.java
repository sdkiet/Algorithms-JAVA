//Accessing keys and modifying their associated value in a HashMap

//The example below shows:

//    How to check if a HashMap is empty | isEmpty()
//    How to find the size of a HashMap | size()
//    How to check if a given key exists in a HashMap | containsKey()
//    How to check if a given value exists in a HashMap | containsValue()
//    How to get the value associated with a given key in the HashMap | get()
//    How to modify the value associated with a given key in the HashMap | put()


import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
    public static void main(String[] args) {
        Map<String, String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        System.out.println("userCityMapping HashMap : " + userCityMapping);

        // Find the size of a HashMap
        System.out.println("We have the city information of " + userCityMapping.size() + " users");

        String userName = "Steve";
        // Check if a key exists in the HashMap
        if(userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        // Check if a value exists in a HashMap
        if(userCityMapping.containsValue("New York")) {
            System.out.println("There is a user in the userCityMapping who lives in New York");
        } else {
            System.out.println("There is no user in the userCityMapping who lives in New York");
        }


        // Modify the value assigned to an existing key
        userCityMapping.put(userName, "California");
        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);

        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));
    }
}

