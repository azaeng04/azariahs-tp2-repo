/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.ocp.correct.impl;

import com.question03.design.principles.ocp.correct.Calculator;

/**
 *
 * @author Ronald
 */
public class CalculatorAddedImpl implements Calculator{
    CalculatorImpl calculatorImpl = new CalculatorImpl();
    @Override
    public int add(int a, int b) {
        return calculatorImpl.add(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculatorImpl.subtract(a, b);
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        if (b == 0) {
            throw new NumberFormatException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }
    
}
