package com.kodilla.good.patterns.challenges.orderservice;

import java.util.Random;

public class ProductOrderService {
    public boolean buy(final Product product) {
        System.out.println(product);
        Random random = new Random();

        return random.nextBoolean();
    }
}
