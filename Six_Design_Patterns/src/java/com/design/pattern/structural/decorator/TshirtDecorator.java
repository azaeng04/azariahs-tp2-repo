/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public class TshirtDecorator extends PersonDecorator{

    public TshirtDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        person.dress();
        System.out.println("I have a tshirt");
        addTshirt();
    }
    
    private void addTshirt() {
        System.out.println("Louis Vuitton tshirt is on");
    }
    
}
