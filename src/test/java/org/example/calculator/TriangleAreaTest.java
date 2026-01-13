package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAreaTest {

    @Test
    void areaOfTriangleShouldBeCorrect() {
        TriangleArea triangleArea = new TriangleArea();

        double result = triangleArea.calculate(10, 5);

        assertEquals(25.0, result);
    }
}
