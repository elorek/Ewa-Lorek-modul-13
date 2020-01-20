package com.kodilla.good.patterns.challenges.food2door;

public class NewProducer1 implements Processor {


    @Override
    public void process(Producer producer) {
        if(Buy.order()) {
            System.out.println("You've just made your order. You can join our loyalty program if you'll make 4 more");
        }
    }

    @Override
    public String inform(User user) {
        return null;
    }
}
