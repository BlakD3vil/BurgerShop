package DecoratorPattern;

import FactoryPattern.Burger;

public abstract class Sauce extends Burger {
    protected Burger burger;
    public Sauce(Burger burger) {
        this.burger = burger;
    }
}
