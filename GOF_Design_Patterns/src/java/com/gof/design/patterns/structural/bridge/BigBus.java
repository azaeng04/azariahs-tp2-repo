/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.bridge;

/**
 *
 * @author Ronald
 */
public class BigBus extends Vehicle{

    public BigBus(Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe big bus is driving");
        int horsePower = engine.go();
        reportOnSpeed(horsePower);
    }
}
