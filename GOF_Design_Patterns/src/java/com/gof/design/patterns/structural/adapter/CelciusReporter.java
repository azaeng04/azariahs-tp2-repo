/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.adapter;

/**
 *
 * @author Azariahs
 */
public class CelciusReporter {
    double temperatureInC;

    public CelciusReporter() {
    }

    public double getTemperatureInC() {
        return temperatureInC;
    }

    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}
