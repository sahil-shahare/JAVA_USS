package Collection_Framework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQcustom {
    public static void main(String[] args) {
        Queue<Car> cars = new PriorityQueue<>(new idComparator());
        cars.add(new Car(1, 89.99));
        cars.add(new Car(6, 34.4));
        cars.add(new Car(2, 46.55));

        System.out.println(cars);
    }
}

class Car implements Comparable<Car> {
    int id;
    double price;

    public Car(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", price=" + price + "]";
    }
}

class idComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.id - o2.id;
    }

}