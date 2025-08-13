package Variables;

public class Local_variable {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.run();
    }
}

class Animal {
    public void run() {
        System.out.println("running");
    }
}

// It can be declare inside a class and inside a method 
// directly print in method
//we have to create a instance or object to access the class