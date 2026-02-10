package StreamAPI.Reduce_Terminal;

import java.util.function.BiFunction;

public class CustomBi_Function {
    public static void main(String[] args) {
        BiFunction<String, Integer, User> UserCreation = User::new;
        User u = UserCreation.apply("Carl", 23);
        System.out.println(u);
    }
}

class User {

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + "]";
    }

}