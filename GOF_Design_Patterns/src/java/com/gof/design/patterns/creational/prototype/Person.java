/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.prototype;

/**
 *
 * @author Azariahs
 */
public class Person implements Prototype{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }    
}
