package Exception_Handling.Exception_Propagation;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Wrong Age !");
    }

    public InvalidAgeException(String string){
        super(string);
    }
}

class IsIndianException extends Exception{
    public IsIndianException(){
        super("You are not Indian");
    }
    public IsIndianException(String string){
        super(string);
    }
}
