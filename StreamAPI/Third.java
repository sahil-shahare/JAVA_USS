package StreamAPI;


import java.util.HashSet;
import java.util.Set;

public class Third {
    public static void main(String[] args) {
        Set<String> pincodes=new HashSet<>();
        pincodes.add("2135");
        pincodes.add("4568");
        pincodes.add("7892");
        pincodes.add("6548");
        pincodes.add("3221");
        pincodes.add("4862");
        pincodes.add("1325");

        pincodes.stream().map(Integer::parseInt).filter((i)->(i>4000)).forEach(System.out::println);
    }
}
