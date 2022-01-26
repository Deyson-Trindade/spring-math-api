package com.project.math.project.exception;

public class ExceptionGeneric extends RuntimeException {

    public ExceptionGeneric(String message) {
        super(message);
    }

    public ExceptionGeneric(String message, Throwable cause) {
        super(message, cause);
    }


}
