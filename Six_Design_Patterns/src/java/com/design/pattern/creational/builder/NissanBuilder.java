/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.builder;

/**
 *
 * @author Ronald
 */
public class NissanBuilder implements VehicleBuilder{
    Vehicle vehicle;

    public NissanBuilder() {
        vehicle = new Vehicle();
    }

    @Override
    public void buildName() {
        vehicle.setName("Nissan GXI");
    }

    @Override
    public void buildColour() {
        vehicle.setColour("Silver");
    }

    @Override
    public void buildModelNo() {
        vehicle.setModelno("NIS-251");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
