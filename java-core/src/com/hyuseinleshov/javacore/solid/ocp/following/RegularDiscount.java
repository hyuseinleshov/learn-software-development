package com.hyuseinleshov.javacore.solid.ocp.following;

class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.90; // 10% discount
    }
}
