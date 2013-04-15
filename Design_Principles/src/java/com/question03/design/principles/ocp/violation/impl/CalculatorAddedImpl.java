/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.ocp.violation.impl;

/**
 *
 * @author Ronald
 */
public class CalculatorAddedImpl extends CalculatorImpl{
    public int multiplication(int a, int b){
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new NumberFormatException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

}
