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
public class Number implements Expression {
        private int number;
        public Number(int number)       { this.number = number; }
        public int interpret(Map<String,Expression> variables)  { return number; }
}
