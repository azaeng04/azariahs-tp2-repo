/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.bridge;

/**
 *
 * @author Ronald
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract void drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public void reportOnSpeed(int horsePower) {
        int ratio = weightInKilos / horsePower;
        if (ratio < 3) {
            System.out.println("The vehicle is going at a fast speed");
        } else if ((ratio >= 3) && (ratio < 8)) {
            System.out.println("The vehicle is going an average speed");
        } else {
            System.out.println("The vehicle is going at a slow speed");
        }
    }

}
