package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// A subclass of Truck (explicitly permitted)
public final class HeavyTruck extends Truck {
    @Override
    public void drive() {
        System.out.println("Heavy Truck is driving");
    }
}
