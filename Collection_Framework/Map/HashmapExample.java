package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Car, Integer> map = new HashMap<>();
        Car c1 = new Car(1, "Mustang", 568.61);
        Car c2 = new Car(1, "Mustang", 568.61);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        map.put(c1, 1);
        map.put(c2, 2);

        System.out.println(map);
    }
}

class Car {
    int id;
    String name;
    double price;

    public Car(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name, this.price);
    }

    public boolean equals(Object o) {
        Car car = (Car) o;
        return this.id == car.id && this.name.equals(car.name) && this.price == car.price;
    }
}