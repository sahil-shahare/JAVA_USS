package Method_Reference.Constructor_MR;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        ASCI asci= new ASCI();
        List<String> list = Arrays.asList("Latur","Solapur","Pune","Mumbai","Nagpur","Bhandara");
        list.stream().filter(asci::check).forEach(System.out::println);
    }
}

class ASCI {
    public boolean check(String s) {
        return s.charAt(0) > 77;
    }
}