package DecoratorPattern;

import FactoryPattern.Burger;

public class Tzatziki extends Sauce {
    public Tzatziki(Burger burger) {
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
