/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public class ShoesDecorator extends PersonDecorator{

    public ShoesDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        person.dress();
        System.out.println("I have shoes");
        addShoes();
    }
    
    private void addShoes() {
        System.out.println("Louis Vuitton shoes is on");
    }
    
}
