package DecoratorPattern;

import FactoryPattern.Burger;

public class Ketchup extends Sauce {
    public Ketchup(Burger burger) {
        super(burger);
    }

    @Override
    public void prepare() {
        burger.prepare();
    }

    @Override
    public void typeOfSauce(Sauce sauce) {
        burger.typeOfSauce(sauce);
    }
}
