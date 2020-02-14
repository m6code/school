package lab03.cosc301;

@SuppressWarnings("serial")
public class InvalidOperationException extends RuntimeException {

    public InvalidOperationException() {
    }

    public InvalidOperationException(String s) {
        super(s);
    }
}
