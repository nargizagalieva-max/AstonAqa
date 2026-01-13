package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    void sumOfTwoNumbersShouldBeCorrect() {
        ArithmeticOperations operations = new ArithmeticOperations();

        int result = operations.add(2, 3);

        assertEquals(5, result);
    }
}