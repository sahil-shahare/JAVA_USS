package StreamAPI.SortedMethod;

import java.util.ArrayList;
import java.util.List;

public class NaturalSorting {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(78);
        list.add(15);
        list.add(46);
        list.add(35);
        list.add(26);

        list.stream().sorted().forEach(System.out::println);
    }
}
