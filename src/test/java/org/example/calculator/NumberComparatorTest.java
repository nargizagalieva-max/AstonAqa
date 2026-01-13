package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberComparatorTest {

    @Test
    void firstNumberShouldBeGreaterThanSecond() {
        NumberComparator comparator = new NumberComparator();

        int result = comparator.compare(5, 3);

        assertTrue(result > 0);
    }
}