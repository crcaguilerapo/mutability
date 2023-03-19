package org.example.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class IntegerTest
{

    @Test
    public void IntegerTest() {
        Integer a = 1;
        // Before Modification
        assertTrue(a.equals(1));

        modify(a);

        // After Modification
        assertTrue(a.equals(1));
    }

    public static void modify(Integer a1) {
        a1 = 5;
    }
}
