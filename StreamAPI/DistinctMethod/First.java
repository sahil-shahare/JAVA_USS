package StreamAPI.DistinctMethod;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(23);
        list.add(11);
        list.add(34);
        list.add(25);
        list.add(16);
        list.add(16);
        list.add(25);
        list.add(11);
        list.add(34);

        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);
    }
}
