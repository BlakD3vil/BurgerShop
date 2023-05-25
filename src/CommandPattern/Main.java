package CommandPattern;

public class Main {
    public static void main(String[] args){
        Cook cook = new Cook();
        Cashier cashier = new Cashier(cook);
        cashier.Receipt("King Burger");
        cashier.Receipt("Classic Burger");
        cashier.Receipt("Vegetarian Burger");
    }
}
