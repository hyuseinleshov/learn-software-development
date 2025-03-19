package com.hyuseinleshov.javacore.solid.dip.following;

class DataService {
    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void fetchData() {
        database.connect();
        System.out.println("Fetching data...");
    }
}
