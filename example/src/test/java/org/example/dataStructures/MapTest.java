package org.example.dataStructures;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {
    @Test
    public void MapTest() {
        var a = Map.of(1, "one", 2, "two", 3, "three");
        assertTrue(a.equals(Map.of(1, "one", 2, "two", 3, "three")));
    }
}
