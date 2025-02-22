package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// Permitted subclass that is sealed (restricts further implementations)
public sealed class Truck implements Vehicle permits HeavyTruck {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
