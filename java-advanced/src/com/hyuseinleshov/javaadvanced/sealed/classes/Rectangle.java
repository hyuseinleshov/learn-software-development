package com.hyuseinleshov.javaadvanced.sealed.classes;

// A permitted subclass that is sealed (restricts further subclassing)
public sealed class Rectangle extends Shape permits Square {
    protected final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
