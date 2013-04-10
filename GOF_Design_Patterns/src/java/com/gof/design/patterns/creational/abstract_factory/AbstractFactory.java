/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.abstract_factory;

/**
 *
 * @author Azariahs
 */
public class AbstractFactory {
    private static AbstractFactory abstractFactory;
    
    private AbstractFactory() {
    }

    public synchronized static AbstractFactory getMammalFactory() {
        if (abstractFactory==null) {
            abstractFactory = new AbstractFactory();
        }
        return abstractFactory;
    }
    
    public SpeciesFactory getSpeciesFactory(String type){
        if ("mammal".equals(type)) {
            return MammalFactory.getMammalFactory();
        } else {
            return ReptileFactory.getReptileFactory();
        }
    }
}
