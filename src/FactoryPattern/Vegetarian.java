package FactoryPattern;

import DecoratorPattern.Sauce;

public class Vegetarian extends Burger{
    @Override
    public void prepare() {
        System.out.println("Making Vegetarian Burger...");
    }

    @Override
    public void typeOfSauce(Sauce sauce) {

    }
}
