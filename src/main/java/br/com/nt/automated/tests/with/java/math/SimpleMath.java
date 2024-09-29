package br.com.nt.automated.tests.with.java.math;

/**
 * Classe SimpleMath
 * <p>
 * Esta classe fornece métodos para realizar operações matemáticas básicas, como soma, subtração,
 * multiplicação, divisão, cálculo da média e raiz quadrada. Ela é projetada para trabalhar com
 * números do tipo {@code Double}, garantindo precisão para operações que envolvem casas decimais.
 * <p>
 * Todos os métodos garantem que os números fornecidos sejam não-negativos, e a divisão por zero
 * resulta em uma exceção {@code IllegalArgumentException}.
 *
 * <p>Operações disponíveis:
 * <ul>
 *     <li>Soma</li>
 *     <li>Subtração</li>
 *     <li>Multiplicação</li>
 *     <li>Divisão</li>
 *     <li>Cálculo da média</li>
 *     <li>Raiz quadrada</li>
 * </ul>
 *
 * @author ediwaldo neto
 * @version 1.0
 * @since 29/09/2024
 */
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