package CommandPattern;

import DecoratorPattern.Ketchup;
import DecoratorPattern.Tzatziki;
import FactoryPattern.Burger;
import FactoryPattern.Kitchen;

public class Cook {
    public void prepareBurger(String typeOfBurger) {
        Burger burger = Kitchen.prepareBurger(typeOfBurger);
        burger.prepare();
        burger.typeOfSauce(new Tzatziki(burger));
        burger.typeOfSauce(new Ketchup(burger));

    }
}
