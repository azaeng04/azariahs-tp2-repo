/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.adapter;

/**
 *
 * @author Azariahs
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{

    @Override
    public double getTemperatureInF() {
        return fToC(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInC) {
        this.temperatureInC = cToF(temperatureInC);
    }

    @Override
    public double getTemperatureInC() {
        return temperatureInC;
    }

    @Override
    public void setTemperatureInC(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }
    
    private double fToC(double f) {
        return ((f - 32) * 5/9);
    }

    private double cToF(double c) {
        return ((c * 9/5) + 32);
    }
}
