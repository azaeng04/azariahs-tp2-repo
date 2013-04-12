/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public abstract class IceCreamHandler {
    IceCreamHandler successor;

    public void setSuccessor(IceCreamHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(IceCreamEnum request);
}
