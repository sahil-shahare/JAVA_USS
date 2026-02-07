package Method_Reference.Constructor_MR;

import java.util.Arrays;
import java.util.List;

public class Constructor_MR {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "def", "ghi", "jkl");

        list.stream().map(StringBuilder::new).map(StringBuilder::reverse).map(StringBuilder::toString).map(String::toUpperCase)
                .forEach(System.out::println);                                   //.map(String::new)
                
    }

}