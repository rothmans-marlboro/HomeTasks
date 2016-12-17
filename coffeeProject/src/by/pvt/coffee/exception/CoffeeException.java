package by.pvt.coffee.exception;

public class CoffeeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CoffeeException() {
    }

    public CoffeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoffeeException(String message) {
        super(message);
    }

    public CoffeeException(Throwable cause) {
        super(cause);
    }
}