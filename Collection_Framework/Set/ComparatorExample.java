package Collection_Framework.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<Car>(new ratingComparator());
        cars.add(new Car(1, "Honda", 7.7, 20000));
        cars.add(new Car(2, "Hyundi", 8.5, 2500000));

        System.out.println(cars);

    }
}

class Car implements Comparable<Car>{
    int id;
    String name;
    double rating;
    double price;

    public Car(int id, String name, double rating, double price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + "]";
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.rating, o.rating);
    }

}

class priceComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.price, o2.price);
    }

}

class ratingComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o2.rating, o1.rating);
    }

}
