/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.command;

/**
 *
 * @author Ronald
 */
public class MealInvoker {
    Command command;

    public MealInvoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
