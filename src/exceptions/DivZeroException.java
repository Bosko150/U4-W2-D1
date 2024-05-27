package exceptions;

public class DivZeroException extends Exception {
    public DivZeroException() {
        super("Cannot divide by zero");
    }

}

