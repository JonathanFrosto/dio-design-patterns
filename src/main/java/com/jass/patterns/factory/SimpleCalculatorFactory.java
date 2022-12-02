package com.jass.patterns.factory;

import com.jass.patterns.strategy.Calculator;
import com.jass.patterns.decorator.LogCalculatorDecorator;

public class SimpleCalculatorFactory {

    public static Calculator getCalculator(Calculator calculator) {
        return new LogCalculatorDecorator(calculator);
    }
}
