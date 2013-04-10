/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.adapter;

/**
 *
 * @author Azariahs
 */
public class TemperatureObjectReporter implements TemperatureInfo{
    CelciusReporter celciusReporter;

    public TemperatureObjectReporter() {
        celciusReporter = new CelciusReporter();
    }

    @Override
    public double getTemperatureInF() {
        return fToC(celciusReporter.getTemperatureInC());
    }

    @Override
    public void setTemperatureInF(double temperatureInC) {
        celciusReporter.setTemperatureInC(fToC(temperatureInC));
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperatureInC();
    }

    @Override
    public void setTemperatureInC(double temperatureInF) {
        celciusReporter.setTemperatureInC(fToC(temperatureInF));
    }
    
    private double fToC(double f) {
        return ((f - 32) * 5/9);
    }

    private double cToF(double c) {
        return ((c * 9/5) + 32);
    }
}
