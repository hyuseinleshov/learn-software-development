package com.hyuseinleshov.javacore.exceptionhandling;

// Custom unchecked exception
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
