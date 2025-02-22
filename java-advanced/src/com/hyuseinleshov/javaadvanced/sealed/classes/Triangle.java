package com.hyuseinleshov.javaadvanced.sealed.classes;

// A permitted subclass that is non-sealed (can be freely extended)
public non-sealed class Triangle extends Shape {
    private final double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
