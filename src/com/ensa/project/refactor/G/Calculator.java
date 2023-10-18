package com.ensa.project.refactor.G;

public class Calculator {

    public int calculateTotalPrice(Order order) {
        int subtotal = calculateSubtotal(order);
        int discount = calculateDiscount(order);
        int tax = calculateTax(order);

        return subtotal - discount + tax;
    }

    private int calculateSubtotal(Order order) {
        int subtotal = 0;
        // Logic to calculate the subtotal
        // ...
        return subtotal;
    }

    private int calculateDiscount(Order order) {
        int discount = 0;
        // Logic to calculate the discount
        // ...
        return discount;
    }

    private int calculateTax(Order order) {
        int tax = 0;
        // Logic to calculate the tax
        // ...
        return tax;
    }
}

class Order {}
