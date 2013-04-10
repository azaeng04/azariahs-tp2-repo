/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.prototype;

/**
 *
 * @author Azariahs
 */
public class Dog implements Prototype{
    String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }

    @Override
    public String toString() {
        return "Dog{" + "sound=" + sound + '}';
    }
}
