package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(321);
        list.add(654);
        list.add(987);

        
        /**
         * forEach(Consumer) => terminal
         */
        // list.stream().forEach((i)->System.out.println(i));
        
        /**
         * filter(Predicate) => intermediater  
         */
        // list.stream().filter((i)->(i>400)).forEach((i)->{System.out.println(i);});

        
    }
}
