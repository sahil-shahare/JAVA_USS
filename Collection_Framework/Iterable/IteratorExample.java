package Collection_Framework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Rmoving Element Safely
        //Wrong way

        /*
        for(Integer x : list){
        list.remove(x); ConcurrentModificationException
        }
        */

        //Right way 
        /*
        while(itr.hasNext()){
            Integer x = itr.next();
                if(x==20)
                {
                itr.remove();
                }
        }
        */

    }

}