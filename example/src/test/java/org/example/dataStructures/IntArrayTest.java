package org.example.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class IntArrayTest {
    @Test
    public void IntArrayTest() {

        var a = new int[] {1, 2, 3};

        // Before Modification
        assertTrue(
                Arrays.equals(a, new int[] {1, 2, 3})
        );

        modify(a);

        // After Modification
        assertTrue(
                Arrays.equals(a, new int[] {1, 2, 4})
        );
    }

    public static void modify(int[] a1) {
        a1[2] = 4;
    }
}
