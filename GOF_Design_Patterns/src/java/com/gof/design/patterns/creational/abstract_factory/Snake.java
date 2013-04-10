/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.abstract_factory;

/**
 *
 * @author Azariahs
 */
public class Snake extends Animal {

    public Snake() {
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }
    
}
