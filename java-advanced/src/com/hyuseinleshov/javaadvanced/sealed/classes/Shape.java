package com.hyuseinleshov.javaadvanced.sealed.classes;

// Sealed superclass restricting permitted subclasses
public abstract sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
}
