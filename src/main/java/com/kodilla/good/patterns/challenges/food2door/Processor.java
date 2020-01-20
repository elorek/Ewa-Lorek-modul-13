package com.kodilla.good.patterns.challenges.food2door;

public interface Processor {
    void process(Producer producer);
    default String inform(User user) {
        return "Hello, " + user.getUserName() + " " + user.getUserSurname() + "! " + "Your order has been completed!";
    }
}
