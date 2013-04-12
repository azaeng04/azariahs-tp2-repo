/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.command;

/**
 *
 * @author Ronald
 */
public class DinnerCommand implements Command{
    Dinner dinner;

    public DinnerCommand(Dinner dinner) {
        this.dinner = dinner;
    }
    
    @Override
    public void execute() {
        System.out.println("Dinner is being made");
    }
    
}
