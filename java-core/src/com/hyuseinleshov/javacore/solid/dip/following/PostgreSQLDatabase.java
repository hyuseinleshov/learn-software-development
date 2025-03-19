package com.hyuseinleshov.javacore.solid.dip.following;

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}
