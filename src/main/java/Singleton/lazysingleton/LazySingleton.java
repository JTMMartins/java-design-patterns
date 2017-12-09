package Singleton.lazysingleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomeWork() {

        System.out.println("Lazy Singleton is Working\n");
    }
}
