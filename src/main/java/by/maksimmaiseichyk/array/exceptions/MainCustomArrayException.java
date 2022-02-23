package by.maksimmaiseichyk.array.exceptions;

public class MainCustomArrayException extends Exception{
    public MainCustomArrayException(String message, Throwable cause){
        super(message, cause);
    }

    public MainCustomArrayException(String message){
        super(message);
    }

    public MainCustomArrayException(Throwable cause){
        super(cause);
    }
}
