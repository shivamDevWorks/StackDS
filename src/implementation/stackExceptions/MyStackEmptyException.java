package implementation.stackExceptions;

public class MyStackEmptyException extends RuntimeException{
    public MyStackEmptyException(String message){
        super(message);
    }
}
