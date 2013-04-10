/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.factory;

/**
 *
 * @author Azariahs
 */
public class AnimalFactory {
    private static AnimalFactory animalFactory;

    private AnimalFactory() {
    }
    
    public synchronized static AnimalFactory getAnimalFactory() {
        if (animalFactory==null) {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
        
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
