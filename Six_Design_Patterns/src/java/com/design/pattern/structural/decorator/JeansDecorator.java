/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public class JeansDecorator extends PersonDecorator{

    public JeansDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        person.dress();
        System.out.println("I have a jeans");
        addJeans();
    }
    
    private void addJeans() {
        System.out.println("Louis Vuitton jeans on");
    }
    
}
