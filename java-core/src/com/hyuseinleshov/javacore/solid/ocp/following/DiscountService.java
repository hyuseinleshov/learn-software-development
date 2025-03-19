package com.hyuseinleshov.javacore.solid.ocp.following;

class DiscountService {
    public double applyDiscount(DiscountStrategy strategy, double price) {
        return strategy.applyDiscount(price);
    }
}
