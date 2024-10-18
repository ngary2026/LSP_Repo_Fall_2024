package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * A utility class for operations on HashMaps.
 */
public class MapUtilities {

    /**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 The first HashMap
     * @param map2 The second HashMap
     * @return The number of common key/value pairs
     */
    public static int commonKeyValuePairs(
    		HashMap<String, String> map1,
    		HashMap<String, String> map2
    		) {
    	
        // Check if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through the first map
        for (String key : map1.keySet()) {
            // Check if the key exists in the second map and if the values are the same
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
