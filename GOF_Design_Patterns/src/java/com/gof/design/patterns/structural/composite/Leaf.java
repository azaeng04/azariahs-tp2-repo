/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.composite;

/**
 *
 * @author Ronald
 */
public class Leaf implements Component{
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(name + " leaf says hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println(name + " leaf says goodbye");
    }
}
