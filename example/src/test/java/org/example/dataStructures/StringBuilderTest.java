package org.example.dataStructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringBuilderTest {

    @Test
    public void stringBuilderTest() {
        var a = new StringBuilder("a");
        // Before Modification
        assertTrue(a.toString().equals("a"));

        modify(a);

        // After Modification
        assertTrue(a.toString().equals("aa"));
    }

    public static void modify(StringBuilder a1) {
        a1.append("a");
    }
}
