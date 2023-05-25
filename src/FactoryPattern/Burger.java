package FactoryPattern;

import DecoratorPattern.Sauce;

public abstract class Burger {
    public abstract void prepare();
    public abstract void typeOfSauce(Sauce sauce);

}
