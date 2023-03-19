package org.example;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StreamBuilderTest {
    @Test
    public void streamOfTest() {
        var a = Stream
                .builder()
                .add(1)
                .add(2)
                .add(3)
                .build();
    }
}
