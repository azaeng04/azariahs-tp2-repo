/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.creational.prototype;

/**
 *
 * @author Ronald
 */
public class CopyDetails implements Prototype{
    String details;

    public CopyDetails(String details) {
        this.details = details;
    }

    @Override
    public Prototype clone() {
        return new CopyDetails(details);
    }

    @Override
    public String toString() {
        return "Details copied: " + details;
    }
}
