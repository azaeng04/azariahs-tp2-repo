/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.decorator;

/**
 *
 * @author Ronald
 */
public class WingDecorator extends AnimalDecorator{

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have wings");
        fly();
    }
    
    public void fly(){
        System.out.println("I can fly");
    }
}
