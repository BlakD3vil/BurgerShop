package CommandPattern;

public class PrepareBurger implements Command{
    private final Cook cook;
    private final String typeOfBurger;
    public PrepareBurger(Cook cook, String typeOfBurger){
        this.cook = cook;
        this.typeOfBurger = typeOfBurger;
    }
    @Override
    public void execute() {
        cook.prepareBurger(typeOfBurger);
    }
}

