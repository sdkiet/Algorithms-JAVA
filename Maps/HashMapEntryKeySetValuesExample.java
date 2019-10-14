//Obtaining the entrySet, keySet, and values from a HashMap

//The Map interface provides methods to retrieve the set of entries (key-value pairs), the set of keys, and the 
//collection of values.

//The following example shows how to retrieve them from a HashMap -

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
    public static void main(String[] args) {
        Map<String, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put("India", "IN");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");

        // HashMap's entry set
        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries : " + countries);

        // HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes : " + isoCodes);
    }
}
