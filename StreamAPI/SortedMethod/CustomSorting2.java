package StreamAPI.SortedMethod;

import java.util.ArrayList;
import java.util.List;

public class CustomSorting2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("parleg");
        list.add("happy-happy");
        list.add("good-day");
        list.add("bourbon");
        list.add("t20-t20");
        list.add("merrygold");
        list.add("patanjali");
        list.add("tiger");
        list.add("britania");
        list.add("bounce");
        list.add("biscuits");
        list.add("bournvita");

        list.stream()
        .map((i)->(i.toUpperCase()))
        .filter((i)->(i.startsWith("B")))
        .sorted()
        .forEach(System.out::println);
    }
}
