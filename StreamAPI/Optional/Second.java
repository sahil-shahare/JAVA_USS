package StreamAPI.Optional;

import java.util.Optional;

public class Second {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name);

        Optional<String> opt = Optional.of("Java");
        System.out.println(opt);

        Optional<String> opt1 = Optional.empty();
        System.out.println(opt1);

        opt.ifPresent(System.out::println);
        // String value = opt.orElse("Default");
        String value = opt.orElseGet(() -> "Default");
        // String value = opt.orElseThrow();
        opt.orElseThrow(() -> new RuntimeException("Value not found"));


        System.out.println(value);
        



    }
}
