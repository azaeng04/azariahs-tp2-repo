/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.iterator;

/**
 *
 * @author Ronald
 */
public class Item {
    String name;
    float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
    
}
