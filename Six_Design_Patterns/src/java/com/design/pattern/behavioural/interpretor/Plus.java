/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.interpretor;

import java.util.Map;

/**
 *
 * @author Azariahs
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public Plus(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }

    public int interpret(Map<String,Expression> variables)  { 
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
