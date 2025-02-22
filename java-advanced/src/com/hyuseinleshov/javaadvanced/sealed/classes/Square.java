package com.hyuseinleshov.javaadvanced.sealed.classes;

// A subclass of Rectangle (since Rectangle is sealed, it must permit Square explicitly)
public final class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
