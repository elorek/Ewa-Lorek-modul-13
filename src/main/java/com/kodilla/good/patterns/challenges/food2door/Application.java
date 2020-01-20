package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Producer> producerList = new ArrayList<>();
        producerList.add(new Producer("NewProducer1", "dairy products", 150));
        producerList.add(new Producer("NewProducer2", "meat", 100));
        User user = new User("James", "Smith");
        NewProducer1 newProducer1 = new NewProducer1();
        Producer producer = new Producer("ID", "someProduct", 0);
        newProducer1.process(producer);
        NewProducer2 newProducer2 = new NewProducer2();
        newProducer2.inform(user);
    }
}
