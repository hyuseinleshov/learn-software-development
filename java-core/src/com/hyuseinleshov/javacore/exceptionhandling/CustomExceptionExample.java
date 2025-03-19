package com.hyuseinleshov.javacore.exceptionhandling;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws a custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }
}
