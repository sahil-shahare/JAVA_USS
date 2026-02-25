package Constructor.Shallow_Constructor;

public class Example {
    public static void main(String[] args) {

        Address add1 = new Address(44001);

        Person p1 = new Person("Carl", add1);
        Person p2 = p1;

        System.out.println(p2);
        System.out.println(p1);

        p2.address.pin=456411;

        System.out.println(p2);
        System.out.println(p1);

    }
}

class Address {
    int pin;

    public Address(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address [pin=" + pin + "]";
    }

}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

}