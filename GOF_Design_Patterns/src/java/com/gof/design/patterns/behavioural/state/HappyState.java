/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.state;

/**
 *
 * @author Ronald
 */
public class HappyState implements EmotionalState{

    @Override
    public String sayHello() {
        return"Bye, friend!";
    }

    @Override
    public String sayGoodbye() {
        return "Hello, friend!";
    }
    
}
