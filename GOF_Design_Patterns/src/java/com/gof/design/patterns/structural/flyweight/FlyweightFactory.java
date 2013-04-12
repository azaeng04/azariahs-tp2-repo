/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ronald
 */
public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightPool;

    private FlyweightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();
    }
    
    public static FlyweightFactory getInstance(){
        if (flyweightFactory==null) {
            flyweightFactory = new FlyweightFactory();
        }
        return flyweightFactory;
    }
    
    public Flyweight createFlyweight(String key) {
        if (flyweightPool.containsKey(key)) {
            return flyweightPool.get(key);
        } else {
            Flyweight flyweight;
            if ("add".equals(key)) {
                flyweight = new FlyweightAdder();
            } else {
                flyweight = new FlyweightMultiplier();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }        
    }
}
