/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question02.core.principles.inheritance.impl;

import com.question02.core.principles.inheritance.GenePool;
import com.question02.core.principles.inheritance.Person;

/**
 *
 * @author Ronald
 */
public class ChildImpl implements GenePool{
    Person person;
    
    public String getFirstName() {
        return person.getFirstName(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFirstName(String firstName) {
        person.setFirstName(firstName); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLastName() {
        return person.getLastName(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLastName(String lastName) {
        person.setLastName(lastName);
    }

    @Override
    public String blueEyes() {
        return "I have blue eyes";
    }

    @Override
    public String tallGene() {
        return "I am tall";
    }

    @Override
    public String greenEyes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String shortGene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
