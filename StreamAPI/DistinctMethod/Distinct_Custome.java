package StreamAPI.DistinctMethod;

import java.util.ArrayList;
import java.util.List;
// import java.util.Objects;

public class Distinct_Custome {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(123456, "IQOO");
        Mobile mobile2 = new Mobile(123456, "IQOO");
        Mobile mobile3 = new Mobile(123456, "IQOO");
        Mobile mobile4 = new Mobile(123456, "IQOO");

        List<Mobile> mob = new ArrayList<>();
        mob.add(mobile4);
        mob.add(mobile3);
        mob.add(mobile2);
        mob.add(mobile);

        mob.stream().distinct().forEach(System.out::println);

    }
}

class Mobile {
    int price;
    String brand;

    public Mobile(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    // @Override
    // public int hashCode() {
    // return Objects.hash(this.price,this.brand);
    // }

    @Override
    public String toString() {
        return "Mobile [price=" + price + ", brand=" + brand + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

}
