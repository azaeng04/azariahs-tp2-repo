/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Ronald
 */
public class Proxy {
    SlowThing slowThing;

    public Proxy() {
        System.out.println("Creating Proxy at " + new Date());
    }
    
    public void sayHello(){
        if (slowThing==null) {
            slowThing = new SlowThing();
        }
        slowThing.sayHello();
    }
}
