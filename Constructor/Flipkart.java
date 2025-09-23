package Constructor;

public class Flipkart {
    public static void main(String[] args) {

        // Using different constructors
        Order c1 = new Order("Sahil", "948484848", "Pune", "441904");  // full constructor
        Order c2 = new Order("Riya", "9876543210");                    // only name & mobile
        Order c3 = new Order("Amit");                                  // only name
        Order c4 = new Order();                                        // default constructor

        // Deliver orders
        c1.deliver();
        c2.deliver();
        c3.deliver();
        c4.deliver();

        // Print details
        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
        c4.showDetails();
    }
}

class Order {
    // Instance variables
    String name;
    String mobile;
    String city;
    String pincode;
    double price;
    String aadhar;
    String pan;

    // Default Constructor
    public Order() {
        this.name = "Unknown";
        this.mobile = "N/A";
        this.city = "N/A";
        this.pincode = "000000";
    }

    // Constructor with only name
    public Order(String name) {
        this.name = name;
        this.mobile = "N/A";
        this.city = "N/A";
        this.pincode = "000000";
    }

    // Constructor with name & mobile
    public Order(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
        this.city = "N/A";
        this.pincode = "000000";
    }

    // Full Constructor
    public Order(String name, String mobile, String city, String pincode) {
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.pincode = pincode;
    }

    // Method
    public void deliver() {
        System.out.println("Order delivered to : " + this.name + " (" + this.city + ")");
    }

    public void showDetails() {
        System.out.println(this.name + " | " + this.mobile + " | " + this.city + " | " + this.pincode);
    }
}
