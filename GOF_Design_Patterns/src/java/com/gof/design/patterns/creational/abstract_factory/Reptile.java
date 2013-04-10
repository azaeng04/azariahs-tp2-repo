/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.abstract_factory;

/**
 *
 * @author Azariahs
 */
public class Reptile extends Animal {

    public Reptile() {
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
    
}
