package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// Sealed interface restricting implementations
public sealed interface Vehicle permits Car, Truck, Bike {
    void drive();
}
