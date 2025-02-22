package com.hyuseinleshov.javaadvanced.sealed.classes;

// A permitted subclass that is final (cannot be extended further)
public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
