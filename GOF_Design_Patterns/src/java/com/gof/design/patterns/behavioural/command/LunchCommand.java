/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.command;

/**
 *
 * @author Ronald
 */
public class LunchCommand implements Command{
    Lunch lunch;

    public LunchCommand(Lunch lunch) {
        this.lunch = lunch;
    }

    @Override
    public void execute() {
        System.out.println("Lunch is being made");
    }
    
}
