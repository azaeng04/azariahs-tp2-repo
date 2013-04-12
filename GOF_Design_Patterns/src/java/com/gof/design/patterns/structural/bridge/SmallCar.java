/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.bridge;

/**
 *
 * @author Ronald
 */
public class SmallCar extends Vehicle{

    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe small car is driving");
        int horsePower = engine.go();
        reportOnSpeed(horsePower);
    }
}
