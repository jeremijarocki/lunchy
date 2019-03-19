package sda.soft.academy.lunchyproject.lunchy.exceptions;

public class TransactionNotFoundException extends Exception {
    public TransactionNotFoundException(String message) {
        super(message);
    }

    public TransactionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
