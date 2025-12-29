package Collection_Framework.List;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= 10000; i++) {
            list.add(i);
        }

        // System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        System.out.println(list2);
    }
}
