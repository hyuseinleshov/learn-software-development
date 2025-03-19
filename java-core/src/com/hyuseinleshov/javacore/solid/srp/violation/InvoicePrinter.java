package com.hyuseinleshov.javacore.solid.srp.violation;

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}
