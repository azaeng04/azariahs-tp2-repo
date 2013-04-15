/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question01.core.principles.inheritance.impl;

import com.question01.core.principles.inheritance.GenePool;
import com.question01.core.principles.inheritance.Person;

/**
 *
 * @author Ronald
 */
public class ChildImpl extends Person implements GenePool{

    @Override
    public String getFirstName() {
        return super.getFirstName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLastName() {
        return super.getLastName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName); //To change body of generated methods, choose Tools | Templates.
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
