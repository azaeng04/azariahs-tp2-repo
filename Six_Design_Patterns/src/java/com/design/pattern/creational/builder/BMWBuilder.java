/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.builder;

/**
 *
 * @author Ronald
 */
public class BMWBuilder implements VehicleBuilder{
    Vehicle vehicle;

    public BMWBuilder() {
        vehicle = new Vehicle();
    }

    @Override
    public void buildName() {
        vehicle.setName("BMW");
    }

    @Override
    public void buildColour() {
        vehicle.setColour("Metalic Blue");
    }

    @Override
    public void buildModelNo() {
        vehicle.setModelno("BMW-251");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
    
}
