package Exception_Handling;

public class invalidDayException extends RuntimeException {
    public invalidDayException() {
        super("Wrong Day !");
    }

    public invalidDayException(String string) {
        super(string);
    }

}