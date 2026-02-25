package Constructor.Deepcopy_Constructor;

public class Example {
    public static void main(String[] args) {

        Address add1 = new Address();
        add1.pin=440011;

        Person p1 =new Person("Carl", add1);
        System.out.println(p1);

        Person p2 = new Person(p1);
        System.out.println(p2);

        p2.address.pin=456123;
        System.out.println(p1);
        System.out.println(p2);

    }
}

class Address {
    int pin;

    public Address() {

    }

    public Address(Address other) {
        this.pin = other.pin;
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

    public Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

}