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
public class CalculatorImpl implements Calculator{

    @Override
    public int add(int a, int b){
        return a + b;
    }
    
    @Override
    public int subtract(int a, int b){
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int division(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
