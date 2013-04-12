/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.bridge;

/**
 *
 * @author Ronald
 */
public class BigEngine implements Engine{
    int horsePower;

    public BigEngine() {
        horsePower = 350;
    }

    @Override
    public int go() {
        System.out.println("The big engine is running");
        return horsePower;
    }
}
