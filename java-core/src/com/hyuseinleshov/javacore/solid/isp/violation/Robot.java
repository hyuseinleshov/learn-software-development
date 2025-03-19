package com.hyuseinleshov.javacore.solid.isp.violation;

class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working...");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}
