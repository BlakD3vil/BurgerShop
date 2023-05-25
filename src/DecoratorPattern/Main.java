package DecoratorPattern;

import FactoryPattern.Burger;
import FactoryPattern.King;

public class Main {
    public static void main(String[] args){
        Burger burger = new King();
        burger.prepare();
        burger.typeOfSauce(new Tzatziki(burger));
        burger.typeOfSauce(new Ketchup(burger));
    }
}
