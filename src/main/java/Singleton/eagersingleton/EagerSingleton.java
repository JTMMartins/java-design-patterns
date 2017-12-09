package Singleton.eagersingleton;


/**
 * Singleton class. Static Eager. ThreadSafe
 */

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();


    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {

        return INSTANCE;
    }

    public void doSomeWork() {

        System.out.println("EagerSingleton doing whatever it should do\n");
    }
}


