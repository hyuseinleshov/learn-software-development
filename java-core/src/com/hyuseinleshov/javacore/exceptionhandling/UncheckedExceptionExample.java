package com.hyuseinleshov.javacore.exceptionhandling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            processNumber(-5); // This will throw an exception
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws an unchecked exception
    public static void processNumber(int number) {
        if (number < 0) {
            throw new InvalidInputException("Number cannot be negative.");
        }
        System.out.println("Valid number: " + number);
    }
}
