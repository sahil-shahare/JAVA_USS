package StreamAPI.Functional_Interface;

import java.util.function.Predicate;

public class oddEven {

    public static void main(String[] args) {
        Predicate<Integer> pred = new oddEvenNumberTest();
        System.out.println(pred.test(23)); 
        
    }
}

class oddEvenNumberTest implements Predicate<Integer>{

    public boolean test(Integer t) {
        if(t%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}