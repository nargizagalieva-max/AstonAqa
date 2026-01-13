package org.example.calculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class ArithmeticOperationsTest {

    @Test
    public void sumOfTwoNumbersShouldBeCorrect() {
        ArithmeticOperations operations = new ArithmeticOperations();

        int result = operations.add(2, 3);

        assertEquals(result, 5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZeroShouldThrowException() {
        ArithmeticOperations operations = new ArithmeticOperations();
        operations.divide(10, 0);
    }
}
