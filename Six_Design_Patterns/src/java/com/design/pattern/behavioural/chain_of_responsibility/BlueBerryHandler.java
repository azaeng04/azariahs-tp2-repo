/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public class BlueBerryHandler extends IceCreamHandler{

    public void handleRequest(IceCreamEnum request) {
        if (request == IceCreamEnum.BLUEBERRY) {
            System.out.println("BlueBerryHandler handles " + request);
        } else {
            if (successor != null) {
                System.out.println("BlueBerryHandler does not handle " + request);
                successor.handleRequest(request);
            }
        }
    }
    
}
