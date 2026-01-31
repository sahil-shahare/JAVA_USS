package StreamAPI.Limit_Skip_Methodes;

import java.util.ArrayList;
import java.util.List;

public class First {

    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(122);
        list.add(87);
        list.add(67);
        list.add(45);
        list.add(85);
        list.add(37);

        System.out.println(list);

        //Find 2nd element
        list.stream()
        .sorted()
        .limit(2)
        .skip(1)
        .forEach(System.out::println);
    }
}