/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.strategy;

/**
 *
 * @author Ronald
 */
public class Context {
    int temperatureInF;
    Strategy strategy;

    public Context(int temperatureInF, Strategy strategy) {
        this.temperatureInF = temperatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperatureInF() {
        return temperatureInF;
    }

    public boolean getResult() {
        return strategy.checkTemperature(temperatureInF);
    }
}
