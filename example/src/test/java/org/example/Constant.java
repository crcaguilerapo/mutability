package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class Constant {
    @Test
    public void constant() {
        final var a = 3;
        final var b = new LinkedList<Integer>(List.of(1, 2, 3));
    }
}
