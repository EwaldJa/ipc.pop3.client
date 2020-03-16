package ipc.pop3.client.utils.exceptions;

public class InvalidServerAddressException extends Exception {

    public InvalidServerAddressException(String message) {
        super(message);
    }

    public InvalidServerAddressException(String message, Exception cause) {
        super(message, cause);
    }

}
