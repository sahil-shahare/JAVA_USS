package Map;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Sahil");
        map.put(2, "Carl");
        map.put(3, "Viraj");
        // System.out.println(map);
        // System.out.println(map.get(3));

        for (int i: map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
