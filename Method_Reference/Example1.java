package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        // list.forEach(Tup::con1);

        list.stream().filter(Check::isEven).forEach(System.out::println);
        }
}
