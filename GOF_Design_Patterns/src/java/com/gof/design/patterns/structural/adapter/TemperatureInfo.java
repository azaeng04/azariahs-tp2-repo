/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.adapter;

/**
 *
 * @author Azariahs
 */
public interface TemperatureInfo {
    public double getTemperatureInF();
    public void setTemperatureInF(double temperatureInC);
    public double getTemperatureInC();
    public void setTemperatureInC(double temperatureInF);
}
