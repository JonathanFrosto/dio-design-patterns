package com.jass.patterns;

import com.jass.patterns.factory.SimpleCalculatorFactory;
import com.jass.patterns.strategy.Calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("ADD CALCULATOR:");
        Calculator addCalculator = SimpleCalculatorFactory.getCalculator(((num1, num2) -> num1 + num2));
        addCalculator.doOperation(2, 3);

        System.out.println("SUBTRACT CALCULATOR:");
        Calculator subtractCalculator = SimpleCalculatorFactory.getCalculator(((num1, num2) -> num1 - num2));
        subtractCalculator.doOperation(10, 3);

        System.out.println("MULTIPLY CALCULATOR:");
        Calculator multiplyCalculator = SimpleCalculatorFactory.getCalculator(((num1, num2) -> num1 * num2));
        multiplyCalculator.doOperation(3, 5);
    }
}
