package com.jass.patterns.decorator;

import com.jass.patterns.strategy.Calculator;

public class LogCalculatorDecorator implements Calculator {

    private final Calculator calculator;

    public LogCalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        System.out.println("Input values: " + num1 + ", " + num2);
        Integer result = calculator.doOperation(num1, num2);
        System.out.println("Output value: " + result);

        return result;
    }
}
