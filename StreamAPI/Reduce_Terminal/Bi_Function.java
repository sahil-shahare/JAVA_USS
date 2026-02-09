package StreamAPI.Reduce_Terminal;

import java.util.function.BiFunction;

public class Bi_Function {
    public static void main(String[] args) {
        //Lambda
        // BiFunction<String,StringBuilder,Integer> Bi = (i,j)->(i.length()+j.length());
        
        //Static Method Reference
        BiFunction<String,StringBuilder,Integer> Bi = Demo :: stringLength;

        System.out.println( Bi.apply("abc", new StringBuilder("asdasfs")));
    }
}

class Demo {
    public static int stringLength(String s1, StringBuilder s2) {
        return s1.length() + s2.length();
    }
}