package StreamAPI.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Carl","Franklin","Michael");
        StringBuilder sb = new StringBuilder();
        list.stream().map(sb::append).map(String::new).collect(null);
    }
}

class String_Concator implements Collector<String,StringBuilder,StringBuilder>{
    
}