package com.hyuseinleshov.javacore.solid.dip.following;

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}
