package org.example.dataStructures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecordTest {
    public record Point(int x, int y) {}

    @Test
    public void recordTest() {

        var a = new Point(2, 4);
        // Before Modification
        assertTrue(a.equals(new Point(2, 4)));
    }
}
