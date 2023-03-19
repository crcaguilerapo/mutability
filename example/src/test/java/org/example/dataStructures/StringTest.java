package org.example.dataStructures;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {

    @Test
    public void stringTest() {
        String a = "a";

        // Before Modification
        assertTrue(a.equals("a"));

        modify(a);

        // After Modification
        assertTrue(a.equals("a"));
    }

    public static void modify(String a1) {
       a1 = a1 + "a";
    }
}