package org.example.problems;

import org.junit.jupiter.api.Test;
import java.util.Date;

public class SideCauseTest {

    private static Date groundhogAnswer = null;


    public static Date startOfSpring() {
        if (groundhogAnswer == null) {
            groundhogAnswer = new Date(2020, 12, 20);
        }
        return groundhogAnswer;
    }

    @Test
    public static void partyPlanning() {
        Date partyDate = startOfSpring();
        partyDate.setMonth(partyDate.getMonth() + 1);
    }
}
