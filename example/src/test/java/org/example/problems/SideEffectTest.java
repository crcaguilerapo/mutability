package org.example.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SideEffectTest {
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
        var newList = List.copyOf(list);
        // let's reuse sum(), because DRY, so first we take absolute values
        for (int i = 0; i < list.size(); ++i) {
            list.set(i, Math.abs(list.get(i)));
        }
        return sum(list);
    }

    // meanwhile, somewhere else in the code...
    @Test
    public void sideEffectTest() {
        // ...
        List<Integer> myData = Arrays.asList(-5, -3, -2);
        System.out.println(sumAbsolute(myData));
        System.out.println(sum(myData));
    }
}
