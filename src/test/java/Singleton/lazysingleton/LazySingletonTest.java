package Singleton.lazysingleton;

import Singleton.eagersingleton.EagerSingleton;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LazySingletonTest {

    /**
     * TEST that singleton is always the same object (SINGLE THREAD)
     */
    @Test
    public void testMultipleInstantiationReturnTheSameObject() throws Exception {
        /* create 4 instances of singleton */
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();
        LazySingleton ls3 = LazySingleton.getInstance();
        LazySingleton ls4 = LazySingleton.getInstance();
        /* check they are the same */
        assertSame(ls1, ls2);
        assertSame(ls2, ls3);
        assertSame(ls3, ls4);
    }


    /**
     * MULTITHREAD test. This test will ocasionaly fail.
     * That means, that sometimes we do not get the
     * same object.
     * So if using threads, don't use Lazy Singleton
     */
    @Test
    public void testMultithreadLazySingletonInstantiation() {

        /* Prepare a list of 10 testers objects*/
        List<Test1> testers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testers.add(new Test1());
        }

        /* prepare a list of threads */
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < testers.size(); i++) {
            threads.add(new Thread(testers.get(i)));
        }

        /* Launch threads */
        for (int i = 0; i < threads.size(); i++) {
            Thread thread = threads.get(i);
            thread.start();
        }

    }

}

/*auxiliaty class for threads.*/
final class Test1 implements Runnable {
    private static Integer lastHascode;
    private Integer thisHashCode;

    @Override
    public void run() {
        System.out.println("Thread started");
        thisHashCode = 0;
        LazySingleton lazySingleton = LazySingleton.getInstance();

        if (lastHascode == null) {
            lastHascode = EagerSingleton.getInstance().hashCode();
        }
        thisHashCode = lazySingleton.hashCode();
        assertEquals(thisHashCode, lastHascode);
        lastHascode = thisHashCode;

    }
}