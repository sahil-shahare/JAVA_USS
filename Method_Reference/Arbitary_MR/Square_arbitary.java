package Method_Reference.Arbitary_MR;

import java.util.Arrays;
import java.util.List;

public class Square_arbitary {

    public static void main(String[] args) {

        SquareDecider sq = new SquareDecider();

        List<String> list = Arrays.asList("asdw", "as", "dggsdg", "htt");
        list.stream().map(String::length).map(sq::square).forEach(System.out::println);
    }
}

class SquareDecider {
    public Integer square(Integer i) {
        return i * i;
    }
}