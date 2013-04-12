/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.decorator;

/**
 *
 * @author Ronald
 */
public class LivingAnimal implements Animal{

    @Override
    public void describe() {
        System.out.println("\nI am an animal");
    }
    
}
