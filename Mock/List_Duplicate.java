package Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List_Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 5, 8, 6, 4, 6, 4, 9, 7);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();

        // for (Integer i : list) {
        // if(seen.add(i)){

        // }
        // else{
        // duplicate.add(i);
        // }
        // }

        for (Integer i : list) {
            if (!seen.add(i)) {
                duplicate.add(i);
            }

        }

        List<Integer> list2 = new ArrayList<>(duplicate);
        System.out.println(list2);

    }
}
