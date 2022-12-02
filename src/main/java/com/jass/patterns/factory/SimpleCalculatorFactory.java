package com.jass.patterns.factory;

import com.jass.patterns.strategy.Calculator;
import com.jass.patterns.decorator.LogCalculatorDecorator;

public class SimpleCalculatorFactory {

    public static Calculator getCalculator(Calculator calculator) {
        if (calculator == null) throw new IllegalArgumentException("Argument can't be null");
        return new LogCalculatorDecorator(calculator);
    }
}
