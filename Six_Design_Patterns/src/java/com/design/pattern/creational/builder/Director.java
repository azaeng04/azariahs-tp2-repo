/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.builder;

/**
 *
 * @author Ronald
 */
public class Director {
    VehicleBuilder vehicleBuilder = null;

    public Director(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }
    
    public void constructVehicle() {
        vehicleBuilder.buildModelNo();
        vehicleBuilder.buildColour();
        vehicleBuilder.buildName();
    }
    
    public Vehicle getVehicle(){
        return vehicleBuilder.getVehicle();
    }
}
