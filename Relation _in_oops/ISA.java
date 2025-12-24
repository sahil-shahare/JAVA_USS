public class ISA {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.show();
    }
}

abstract class Animal{
        abstract void show();
}

class Dog extends Animal{

    @Override
    void show() {
        System.out.println("Bark");
    }
    
}