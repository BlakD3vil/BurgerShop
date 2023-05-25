package SingletonPattern;

public class Main {
    public static void main (String[] args) {
        BurgerShopSingleton burgershop = BurgerShopSingleton.getInstance();
        burgershop.clientMessage();

    }
}
