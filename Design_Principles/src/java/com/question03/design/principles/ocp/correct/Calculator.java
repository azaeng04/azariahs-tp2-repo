/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.ocp.correct;

/**
 *
 * @author Ronald
 */
public interface Calculator {
    public int add(int a, int b);
    public int subtract(int a, int b);
    public int multiplication(int a, int b);
    public int division(int a, int b);
}
