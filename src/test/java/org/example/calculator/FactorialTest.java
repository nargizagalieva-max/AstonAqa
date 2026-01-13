package org.example.calculator;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void factorialOfFiveShouldBe120() {
        Factorial factorial = new Factorial();

        int result = factorial.calculate(5);

        assertEquals(result, 120);
    }
}