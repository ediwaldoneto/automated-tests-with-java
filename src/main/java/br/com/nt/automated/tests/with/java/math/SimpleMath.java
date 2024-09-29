package br.com.nt.automated.tests.with.java.math;

public class SimpleMath {


    public Double sum(final Double firstNumber, final Double secondNumber) {
        validateNonNegative(firstNumber, secondNumber);
        return firstNumber + secondNumber;
    }

    public Double subtraction(final Double firstNumber, final Double secondNumber) {
        validateNonNegative(firstNumber, secondNumber);
        return firstNumber - secondNumber;
    }

    public Double multiplication(final Double firstNumber, final Double secondNumber) {
        validateNonNegative(firstNumber, secondNumber);
        return firstNumber * secondNumber;
    }

    public Double division(final Double firstNumber, final Double secondNumber) {
        validateNonNegative(firstNumber, secondNumber);
        if (secondNumber == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return firstNumber / secondNumber;
    }

    public Double mean(final Double firstNumber, final Double secondNumber) {
        validateNonNegative(firstNumber, secondNumber);
        return (firstNumber + secondNumber) / 2;
    }

    public Double squareRoot(final Double number) {
        validateNonNegative(number);
        return Math.sqrt(number);
    }

    private void validateNonNegative(Double... numbers) {
        for (Double number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed: " + number);
            }
        }
    }
}