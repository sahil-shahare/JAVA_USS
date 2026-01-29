package StreamAPI.SortedMethod;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;

public class CustomSorting {
    public static void main(String[] args) {
        Collection<Plant>plants=new ArrayDeque<>();
        plants.add(new Plant(12345, "Mango"));
        plants.add(new Plant(1223, "Apple"));
    
        plants.stream().sorted(new PlantNameComparator()).forEach(System.out::println);
    }
}

class Plant{
    int price;
    String name;

    public Plant(int price,String name){
        this.price=price;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Plant [price=" + price + ", name=" + name + "]";
    }
}

class PlantNameComparator implements Comparator<Plant>{

    @Override
    public int compare(Plant o1, Plant o2) {
        return o2.name.compareTo(o1.name);
    }
    
}
