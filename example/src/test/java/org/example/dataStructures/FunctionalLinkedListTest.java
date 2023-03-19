package org.example.dataStructures;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FunctionalLinkedListTest {
    @Test
    public void FunctionalLinkedListTest() {
        var a = List.of(1, 2, 3);

        // Before Modification
        assertTrue(a.equals(List.of(1, 2, 3)));

        modify(a);

        // After Modification
        assertTrue(a.equals(List.of(1, 2, 3)));
    }

    public static void modify(List<Integer> a1) {
        a1.append(4);
    }
}
