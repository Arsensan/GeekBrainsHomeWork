public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}

