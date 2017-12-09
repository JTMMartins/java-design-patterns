package Singleton.lazysingleton;

/**
 * Exemplo de Utilizacao de Singletons com instanciacao LAZY
 */
public class App {

    public static void main(String[] args) {

        LazySingleton firstLazySingleton = LazySingleton.getInstance();
        firstLazySingleton.doSomeWork();
        System.out.println("firstLazySingleton HashCode = " + String.valueOf(firstLazySingleton.hashCode()) + "\n");


        LazySingleton secondLazySingleton = LazySingleton.getInstance();
        secondLazySingleton.doSomeWork();
        System.out.println("secondLazySingleton HashCode = " + String.valueOf(secondLazySingleton.hashCode()) + "\n");

        System.out.println("if object hashcode is the same, then it's the same object\n");
    }
}
