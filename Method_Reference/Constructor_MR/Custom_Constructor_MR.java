package Method_Reference.Constructor_MR;

import java.util.function.Function;

public class Custom_Constructor_MR {
    public static void main(String[] args) {
        
        Function<String, Van> fun = Van::new;

        System.out.println(fun.apply("Welcome to Pune...!"));
    }
}

class Van{
    String id;

    public Van(String id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "Van [id=" + id + "]";
    }
}