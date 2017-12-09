package Singleton.eagersingleton;

/**
 * Exemplo de Utilizacao de Singletons con instanciacao EAGER
 */
public class App {

    public static void main(String[] args) {

        EagerSingleton firstSingleton = EagerSingleton.getInstance();
        firstSingleton.doSomeWork();
        System.out.println("firstSingleton HashCode = " + String.valueOf(firstSingleton.hashCode()) + "\n");

        EagerSingleton secondSingleton = EagerSingleton.getInstance();
        secondSingleton.doSomeWork();
        System.out.println("secondSingleton HashCode = " + String.valueOf(secondSingleton.hashCode()) + "\n");

        System.out.println("if object hashcode is the same, then it's the same object\n");


    }
}
