/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.abstract_factory;

/**
 *
 * @author Azariahs
 */
public class MammalFactory extends SpeciesFactory {
    private static MammalFactory mammalFactory;
    
    private MammalFactory() {
    }

    public synchronized static MammalFactory getMammalFactory() {
        if (mammalFactory==null) {
            mammalFactory = new MammalFactory();
        }
        return mammalFactory;
    }
    
    @Override
    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }        
    }
    
}
