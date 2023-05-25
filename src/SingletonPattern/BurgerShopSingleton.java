package SingletonPattern;

public class BurgerShopSingleton {
    private static BurgerShopSingleton instance;
    private BurgerShopSingleton() {}
    public static BurgerShopSingleton getInstance(){
        if(instance == null){
            instance = new BurgerShopSingleton();
        }
        return instance;
    }
    public void clientMessage(){
        System.out.println("Please place your order...");
    }
}
