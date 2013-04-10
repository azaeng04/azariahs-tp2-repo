/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.singleton;

import java.util.Date;

/**
 *
 * @author Azariahs
 */
public class Singleton {
    private static Singleton theOnlyOne;
    private Date d = new Date();

    private Singleton() {
    }

    public synchronized static Singleton instance() {
        if (theOnlyOne==null) {
            theOnlyOne = new Singleton();
        }
        return theOnlyOne;
    }
    
    public Date getDate() {
        return d;
    }
}
