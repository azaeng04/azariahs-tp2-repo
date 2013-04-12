/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.decorator;

/**
 *
 * @author Ronald
 */
public abstract class AnimalDecorator implements Animal{
    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
}
