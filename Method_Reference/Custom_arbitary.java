package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Custom_arbitary {

    public static void main(String[] args) {

        List<Book> list = Arrays.asList(new Book(1, 78.2, "Carl"), new Book(2, 98.2, "Johnson"),
                new Book(3, 65.4, "Carry"), new Book(4, 65.6, "David"));

        list.stream().map(Book::gettotal).forEach(System.out::println);
    }
}

class Book {
    int id;
    double price;
    String name;

    public Book(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int gettotal() {
        return this.id + (int) this.price + this.name.length();
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", price=" + price + ", name=" + name + "]";
    }

}