package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {
    public static void main(String[] args) {

        Map<Integer, String> cities = new HashMap<>();
        cities.put(121212, "Mumbai");
        cities.put(123345, "Pune");
        cities.put(441904, "Bhandara");

        System.out.println(cities.entrySet());
        System.out.println("***************************");

        for (Entry<Integer, String> e : cities.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
