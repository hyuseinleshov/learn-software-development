package com.hyuseinleshov.javacore.solid.dip.violation;

class DataService {
    private MySQLDatabase database = new MySQLDatabase();

    public void fetchData() {
        database.connect();
        System.out.println("Fetching data...");
    }
}
