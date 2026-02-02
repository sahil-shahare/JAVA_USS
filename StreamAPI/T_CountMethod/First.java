package StreamAPI.T_CountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class First {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('s');
        list.add('v');
        list.add('r');
        list.add('k');
        list.add('i');
        list.add('c');

        long result = list.stream().count();
        System.out.println(result);

        Set<Character> set = new TreeSet<>(list);//for sorting
        System.out.println(set);
    }
}