package Constructor;

public class Flipkart {
    public static void main(String[] args) {

        // Create a object
        Order c1 = new Order("Sahil", "948484848", "Pune", "441904");
        c1.deliver();
        System.out.println(c1.name + " | " + c1.mobile + " | " + c1.city + " | " + c1.pincode + " | " + c1.price);
    }
}

class Order {
    // Declare Instance variable
    String name;
    String mobile;
    String city;
    String pincode;
    double price;
    String aadhar;
    String pan;

    // Create a parameterized Constructor
    public Order(String cus_name, String cus_mobile, String cus_city, String cus_pincode) {
        this.name = cus_name;
        this.mobile = cus_mobile;
        this.city = cus_city;
        this.pincode = cus_pincode;
    }

    public void deliver() {
        System.out.println("Order delivered to : " + this.name);
    }

}