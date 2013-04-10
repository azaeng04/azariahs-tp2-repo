/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.abstract_factory;

/**
 *
 * @author Azariahs
 */
public class ReptileFactory extends SpeciesFactory {
    private static ReptileFactory reptileFactory;
    
    private ReptileFactory() {
    }

    public synchronized static ReptileFactory getReptileFactory() {
        if (reptileFactory==null) {
            reptileFactory = new ReptileFactory();
        }
        return reptileFactory;
    }

    @Override
    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
            return new Snake();
        } else {
            return new Reptile();
        }
    }
    
}
