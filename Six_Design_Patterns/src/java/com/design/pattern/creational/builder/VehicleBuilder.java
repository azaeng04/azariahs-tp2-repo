/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.builder;

/**
 *
 * @author Ronald
 */
public interface VehicleBuilder {
    public void buildName();
    public void buildColour();
    public void buildModelNo();
    public Vehicle getVehicle();
}
