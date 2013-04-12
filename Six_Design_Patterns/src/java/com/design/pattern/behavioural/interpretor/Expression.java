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
public interface Expression {
    public int interpret(Map<String,Expression> variables);
}
