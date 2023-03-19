package org.example.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
    @Test
    public void LinkedListTest() {
        var a = List.of(1, 2, 3);
        assertTrue(a.equals(List.of(1, 2, 3)));
    }
}
