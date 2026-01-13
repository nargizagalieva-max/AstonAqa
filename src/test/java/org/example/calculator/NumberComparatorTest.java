package org.example.calculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NumberComparatorTest {

    @Test
    public void firstNumberShouldBeGreaterThanSecond() {
        NumberComparator comparator = new NumberComparator();

        int result = comparator.compare(5, 3);

        assertTrue(result > 0);
    }
}

