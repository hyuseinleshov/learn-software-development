package com.hyuseinleshov.javaadvanced.sealed.interfaces;

// Main class to test sealed interfaces
public class Demo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle heavyTruck = new HeavyTruck();
        Vehicle bike = new Bike();

        car.drive();
        truck.drive();
        heavyTruck.drive();
        bike.drive();
    }
}
