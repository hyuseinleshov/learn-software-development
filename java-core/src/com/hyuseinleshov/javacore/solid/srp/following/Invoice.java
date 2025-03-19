package com.hyuseinleshov.javacore.solid.srp.following;

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void printInvoice() {
        System.out.println("Invoice amount: " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
    }
}
