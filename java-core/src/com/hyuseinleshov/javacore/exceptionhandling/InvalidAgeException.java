package com.hyuseinleshov.javacore.exceptionhandling;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
