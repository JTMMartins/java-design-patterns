package Singleton.enumsingleton;

/**
 * Exemplo de Utilizacao de Singletons baseados em Enum
 */
public class App {

    public static void main(String[] args) {

        EnumEagerSingleton firstEnumSingleton = EnumEagerSingleton.INSTANCE;
        String firstEnumSingletonResponse = EnumEagerSingleton.INSTANCE.doSomeWork();

        System.out.println(firstEnumSingletonResponse + "\n");
        System.out.println("firstEnumSingleton HashCode = " + String.valueOf(firstEnumSingleton.hashCode()) + "\n");


        EnumEagerSingleton secondEnumSingleton = EnumEagerSingleton.INSTANCE;
        String secondEnumSingletonResponse = EnumEagerSingleton.INSTANCE.doSomeWork();
        System.out.println(secondEnumSingletonResponse + "\n");

        System.out.println("secondEnumSingleton HashCode = " + String.valueOf(secondEnumSingleton.hashCode()) + "\n");

        System.out.println("if object hashcode is the same, then it's the same object\n");

    }

}
