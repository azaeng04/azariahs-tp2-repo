/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.decorator;

/**
 *
 * @author Ronald
 */
public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have legs.");
        dance();
    }
    
    public void dance(){
        System.out.println("I can dance.");
    }
}
