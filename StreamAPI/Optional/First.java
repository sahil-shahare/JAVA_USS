package StreamAPI.Optional;

import java.util.Optional;

public class First {

    public static void main(String[] args) {
        Optional<String> op = Optional.ofNullable(null);

        op.ifPresentOrElse(System.out::println,()->{System.out.println("Empty Optional");});

    }
    
}
