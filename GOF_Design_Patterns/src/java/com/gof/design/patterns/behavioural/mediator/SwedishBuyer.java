/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.mediator;

/**
 *
 * @author Ronald
 */
public class SwedishBuyer extends Buyer{
    public SwedishBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerSwedishBuyer(this);
    }
}
