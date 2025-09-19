package SIGI;

public class SIGI {
    public static void main(String[] args) {
        Plant plant =new Plant();
        plant.setNummber(100);
        plant.setName("Mango");
        System.out.println(plant.getName());
        System.out.println(plant.getNumber());
    }
}

class Plant{
    int number;
    String name;

    //Setter
    public void setNummber(int number){
        this.number=number;
    }

    public void setName(String name){
        this.name=name;
    }

    //Getter
    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

}