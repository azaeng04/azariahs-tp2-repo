/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public class StrawberryHandler extends IceCreamHandler{

    public void handleRequest(IceCreamEnum request) {
        if (request == IceCreamEnum.STRAWBERRY) {
            System.out.println("StrawberryHandler handles " + request);
        } else {
            if (successor != null) {
                System.out.println("StrawberryHandler does not handle " + request);
                successor.handleRequest(request);
            }
        }
    }
    
}
