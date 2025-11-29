package implementation.stackExceptions;

public class MyStackOverflowException extends RuntimeException{
    public MyStackOverflowException(String message){
        super(message);
    }
}
