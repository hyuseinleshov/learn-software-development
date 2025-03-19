package com.hyuseinleshov.javacore.solid.isp.following;

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working...");
    }

    public void eat() {
        System.out.println("Human is eating...");
    }
}
