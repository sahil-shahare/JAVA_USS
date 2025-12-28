package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i+1);
        }

        System.out.println(list);
    }

}
