/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.decorator;

/**
 *
 * @author Azariahs
 */
public abstract class PersonDecorator implements Person{
   Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }
}
