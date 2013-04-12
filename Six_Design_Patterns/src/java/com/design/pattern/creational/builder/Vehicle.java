/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.builder;

/**
 *
 * @author Ronald
 */
public class Vehicle {
    private String name;
    private String colour;
    private String modelno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "name=" + name + ", colour=" + colour + ", modelno=" + modelno + '}';
    }
}
