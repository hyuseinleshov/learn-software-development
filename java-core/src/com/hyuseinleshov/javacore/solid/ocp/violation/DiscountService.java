package com.hyuseinleshov.javacore.solid.ocp.violation;

class DiscountService {
    public double applyDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.90; // 10% discount
        } else if (customerType.equals("VIP")) {
            return price * 0.80; // 20% discount
        }
        return price;
    }
}
