package com.kodilla.good.patterns.challenges.orderservice;

public class PriceCalculator {
    public double calculatePrice(Product product) {

        double price = product.getProductPrice() * product.getHowMany();
        return price;
    }
}

