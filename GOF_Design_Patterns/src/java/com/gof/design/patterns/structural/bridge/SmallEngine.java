/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.bridge;

/**
 *
 * @author Ronald
 */
public class SmallEngine implements Engine{
    int horsePower;

    public SmallEngine() {
        horsePower = 100;
    }
    
    @Override
    public int go() {
        System.out.println("The small engine is running");
        return horsePower;
    }
}
