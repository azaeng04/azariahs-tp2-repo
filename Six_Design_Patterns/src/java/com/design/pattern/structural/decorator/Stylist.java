/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public class Stylist implements Person{

    @Override
    public void dress() {
        System.out.println("I am Stylist");
    }
    
}
