package org.example.calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaTest {

    @Test
    public void areaOfTriangleShouldBeCorrect() {
        TriangleArea triangleArea = new TriangleArea();

        double result = triangleArea.calculate(10, 5);

        assertEquals(result, 25.0);
    }
}

