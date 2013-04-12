/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.decorator;

/**
 *
 * @author Ronald
 */
public class GrowlDecorator extends AnimalDecorator{

    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I can growl");
        growl();
    }
    
    public void growl(){
        System.out.println("Grrrrr.");
    }
}
