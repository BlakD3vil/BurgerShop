package FactoryPattern;

import DecoratorPattern.Sauce;

public class King extends Burger{
    @Override
    public void prepare() {
        System.out.println("Making King Burger...");
    }

    @Override
    public void typeOfSauce(Sauce sauce) {

    }
}
