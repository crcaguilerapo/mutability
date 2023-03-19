package org.example.dataStructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class IntTest
{

    @Test
    public void intTest() {
        var a = 1;

        // Before Modification
        assertEquals(a, 1);

        modify(a);

        // After Modification
        assertEquals(a, 1);
    }

    public static void modify(int a1) {
        a1 = 5;
    }
}
