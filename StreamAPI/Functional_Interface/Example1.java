package StreamAPI.Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(98);
        list.add(85);
        list.add(23);

        
        Consumer<List<Integer>> cons = (i)->{
            for (int j : i) {
                System.out.println(j);
            }
        };
        cons.accept(list);


        Predicate<List<Integer>> pred = (i)->{
            return list.size()>=5;
        };
        System.out.println(pred.test(list));
       
    }
}
