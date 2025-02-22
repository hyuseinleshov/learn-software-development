package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// A permitted subclass that is non-sealed (can be implemented freely)
public non-sealed class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }
}
