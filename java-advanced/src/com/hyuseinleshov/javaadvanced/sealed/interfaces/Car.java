package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// Permitted subclass that is final (cannot be extended further)
public final class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
