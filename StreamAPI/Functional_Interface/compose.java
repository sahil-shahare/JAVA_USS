package StreamAPI.Functional_Interface;

import java.util.function.Function;

public class compose {
    public static void main(String[] args) {

        // Second execute
        Function<Integer, Double> fun = (t) -> (Double.valueOf(t));

        // First execute
        Function<String, Integer> fun2 = (t) -> (Integer.parseInt(t));

        // Final execute
        // after.compose(before)
        Function<String, Double> fun3 = fun.compose(fun2);

        // Method Call
        System.out.println(fun3.apply("12"));

        
        Function<String, Double> fun4 = fun2.andThen(fun);
        System.out.println(fun4.apply("12"));


    }
}
