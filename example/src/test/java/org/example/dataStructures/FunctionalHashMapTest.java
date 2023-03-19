package org.example.dataStructures;


import io.vavr.collection.HashMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FunctionalHashMapTest {
    @Test
    public void FunctionalHashMapTest() {
        var a = HashMap.of(1, "one", 2, "two", 3, "three");

        // Before Modification
        assertTrue(a.equals(HashMap.of(1, "one", 2, "two", 3, "three")));

        modify(a);

        // After Modification
        assertTrue(a.equals(HashMap.of(1, "one", 2, "two", 3, "three")));
    }

    public static void modify(HashMap<Integer, String> a1) {
        a1.put(4, "four");
    }
}
