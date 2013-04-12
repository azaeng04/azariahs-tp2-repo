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
public abstract class Thing {
    public void sayHello(){
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }
}
