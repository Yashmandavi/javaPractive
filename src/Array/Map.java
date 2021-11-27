package Array;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {


            // Create a HashMap object
            HashMap<String, String> capitalCities = new HashMap<String, String>();


            capitalCities.put("England", "London");
            capitalCities.put("India", "Gujarat");
            capitalCities.put("China", "Chig-chau");
            capitalCities.put("USA", "Washington ");


            System.out.println(capitalCities);

            System.out.println(capitalCities.size());

            System.out.println(capitalCities.remove(1));

            System.out.println(capitalCities.get("England"));
        Set<String>keys = capitalCities.keySet();
        for(String key: keys){
            System.out.println(key);
        }

    }

    }







