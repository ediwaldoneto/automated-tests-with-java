package br.com.nt.automated.tests.with.java.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    @Test
    void testSum_TwoPositiveNumbers_ReturnsSum() {
        SimpleMath math = new SimpleMath();
        final Double firstNumber = 8D;
        final Double secondNumber = 8D;

        final Double actual = math.sum(firstNumber, secondNumber);
        final Double expected = 16D;

        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
        assertNotEquals(20D, actual);
    }

    @Test
    void testSum_NegativeNumber_ThrowsException() {
        SimpleMath math = new SimpleMath();
        assertThrows(IllegalArgumentException.class, () -> {
            math.sum(10.0, -5.0);
        }, "Sum with negative number should throw IllegalArgumentException");
    }

    @Test
    void testSubtraction_TwoPositiveNumbers_ReturnsDifference() {
        SimpleMath math = new SimpleMath();
        final Double firstNumber = 10D;
        final Double secondNumber = 8D;

        final Double actual = math.subtraction(firstNumber, secondNumber);
        final Double expected = 2D;

        assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
        assertNotEquals(20D, actual);
    }

    @Test
    void testMultiplication_TwoPositiveNumbers_ReturnsProduct() {
        SimpleMath math = new SimpleMath();
        final Double firstNumber = 10D;
        final Double secondNumber = 10D;

        final Double actual = math.multiplication(firstNumber, secondNumber);
        final Double expected = 100D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
        assertNotEquals(240D, actual);
    }

    @Test
    void testDivision_TwoPositiveNumbers_ReturnsQuotient() {
        SimpleMath math = new SimpleMath();
        final Double firstNumber = 100D;
        final Double secondNumber = 10D;

        final Double actual = math.division(firstNumber, secondNumber);
        final Double expected = 10D;

        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
        assertNotEquals(2D, actual);
    }

    @Test
    void testDivision_DivideByZero_ThrowsException() {
        SimpleMath simpleMath = new SimpleMath();
        assertThrows(ArithmeticException.class, () -> {
            simpleMath.division(8.0, 0.0);
        }, "Division by zero is not allowed.");
    }

    @Test
    void testMean_TwoPositiveNumbers_ReturnsMean() {
        SimpleMath simpleMath = new SimpleMath();
        final Double firstNumber = 5D;
        final Double secondNumber = 9D;

        final Double actual = simpleMath.mean(firstNumber, secondNumber);
        final Double expected = 7D;

        assertEquals(expected, actual, () -> "(" + firstNumber + " + " + secondNumber + ")" + " / 2 " + " did not produce " + expected);
        assertNotNull(actual);
        assertNotEquals(2D, actual);
    }

    @Test
    void testSquareRoot_PositiveNumber_ReturnsSquareRoot() {
        SimpleMath simpleMath = new SimpleMath();
        final Double number = 16D;

        Double actual = simpleMath.squareRoot(number);
        final Double expected = 4D;

        assertEquals(expected, actual, "The square root of " + number + " must be " + actual);
        assertNotNull(actual);
        assertNotEquals(2D, actual);
    }

    @Test
    void testSquareRoot_NegativeNumber_ThrowsException() {
        SimpleMath math = new SimpleMath();
        assertThrows(IllegalArgumentException.class, () -> {
            math.squareRoot(-4.0);
        }, "Square root of negative number should throw IllegalArgumentException");
    }
}