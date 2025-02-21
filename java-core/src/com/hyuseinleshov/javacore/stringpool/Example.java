package com.hyuseinleshov.javacore.stringpool;

public class Example {
    public static void main(String[] args) {
        String s1 = "Hello"; // Stored in String Pool
        String s2 = "Hello"; // Reuses the same reference

        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference)

        String s3 = new String("Hello"); // New object in heap
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects)

        // Using intern() to store in the String Pool
        String s4 = new String("Hello").intern();
        System.out.println("s1 == s4: " + (s1 == s4)); // true (same reference after interning)
    }
}
