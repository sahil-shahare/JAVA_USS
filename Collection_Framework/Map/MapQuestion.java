package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class MapQuestion {
    public static void main(String[] args) {
        // Counting the frequency
        // MAGADHIRA
        // {M=1,A=3,....}

        String str = "MAGADHIRA";
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int counter = 1;
            if (map.containsKey(chars[i])) {
                counter = map.get(chars[i]) + 1;
                map.put(chars[i], counter);
            } else {
                map.put(chars[i], counter);
            }
        }

        System.out.println(map);
    }
}
