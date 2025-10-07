package Abstraction;

public class Anonymous_Class {
   public static void main(String[] args) {
    City city= new City() {
        public void showpin(String pin){
            System.out.println(pin);
        }
    };
    city.showpin("441026");
   } 
}

abstract class City {
    abstract public void showpin(String pin);   
}