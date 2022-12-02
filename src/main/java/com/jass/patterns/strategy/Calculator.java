package com.jass.patterns.strategy;

@FunctionalInterface
public interface Calculator {

    Integer doOperation(Integer num1, Integer num2);
}
