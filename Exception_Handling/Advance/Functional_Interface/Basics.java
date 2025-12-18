package Functional_Interface;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class Basics {
    public static void main(String[] args) {
        /**
         * There are four type of functional interface
         * 1.Predicate<T> test(Tt)
         * 2.Function<T,R> R apply(Tt)
         * 3.Consumer<T> accept(Tt)
         * 4.Suppiler<T> get()
         */

        Predicate<Integer> p = (i) -> (i == 10);
        System.out.println(p.test(10));

        Function<Integer,String> f = (i)->(i+" A");
        System.out.println(f.apply(15));

        Consumer<String> c = (i)->{System.out.println(i);};
        c.accept("Hello");

        Supplier<Double> s = ()->(Math.random());
        System.out.println(s.get());

    }
}
