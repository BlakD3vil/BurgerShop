package FactoryPattern;

import DecoratorPattern.Sauce;

public class Classic extends Burger{
    @Override
    public void prepare() {
        System.out.println("Making Classic Burger...");
    }

    @Override
    public void typeOfSauce(Sauce sauce) {

    }
}
