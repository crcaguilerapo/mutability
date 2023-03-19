package org.example.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ThreadSafetyTest {

    private List<Integer> list;

    @BeforeAll
    public void setUp() {
        list = Arrays.asList(-5, -3, -2);
    }

    /**
     * @return the sum of the numbers in the list
     */
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum;
    }

    /**
     * @return the sum of the absolute values of the numbers in the list
     */
    public static int sumAbsolute(List<Integer> list) {
        // let's reuse sum(), because DRY, so first we take absolute values
        for (int i = 0; i < list.size(); ++i) {
            list.set(i, Math.abs(list.get(i)));
        }
        return sum(list);
    }


    @Test
    public void threadSafetyTest() throws InterruptedException {
        Thread t1 = new Thread(() -> System.out.println(sumAbsolute(list)));
        Thread t2 = new Thread(() -> System.out.println(sum(list)));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
