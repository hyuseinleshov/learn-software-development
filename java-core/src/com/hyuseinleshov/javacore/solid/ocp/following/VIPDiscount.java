package com.hyuseinleshov.javacore.solid.ocp.following;

class VIPDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.80; // 20% discount
    }
}