package FactoryPattern;

public class Main {
    public static void main (String[] args) {
        Burger burgerKing = Kitchen.prepareBurger("King");
        burgerKing.prepare();
        Burger burgerClassic = Kitchen.prepareBurger("Classic");
        burgerClassic.prepare();
        Burger burgerVegetarian = Kitchen.prepareBurger("Vegetarian");
        burgerVegetarian.prepare();
    }
}
