package StreamAPI.MapMethod;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(6596);
        list.add(984);
        list.add(75);
        list.add(73456);
        list.add(45);

        list.stream().map((i)->(i+"A"))
        .filter((i)->(i.length()>3))
        .forEach((i)->{System.out.println(i);});
    }
}