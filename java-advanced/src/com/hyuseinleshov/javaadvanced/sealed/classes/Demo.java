package com.hyuseinleshov.javaadvanced.sealed.classes;

// Main class to test the hierarchy
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 4);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Square Area: " + square.area());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
