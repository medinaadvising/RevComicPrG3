package com.revature.exceptions;

public class CheckoutUnsuccessfulException extends RuntimeException {

    public CheckoutUnsuccessfulException() {
        super();
    }

    public CheckoutUnsuccessfulException(String message) {
        super(message);
    }

    CheckoutUnsuccessfulException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckoutUnsuccessfulException(Throwable cause) {
        super(cause);
    }

    public CheckoutUnsuccessfulException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

