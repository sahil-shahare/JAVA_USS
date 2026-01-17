package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(99);
        set.add(1);
        set.add(33);
        set.add(58);
        set.add(33);
        set.add(88);
        set.add(65);

        System.out.println(set);

    }
}
