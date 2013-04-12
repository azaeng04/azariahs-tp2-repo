/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public class HatDecorator extends PersonDecorator{

    public HatDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        person.dress();
        System.out.println("I have a hat");
        addHat();
    }
    
    private void addHat() {
        System.out.println("Louis Vuitton hat is on");
    }

}
