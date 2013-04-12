/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public class RasberryHandler extends IceCreamHandler{

    public void handleRequest(IceCreamEnum request) {
        if (request == IceCreamEnum.RASBERRY) {
            System.out.println("RasberryHandler handles " + request);
        } else {
            if (successor != null) {
                System.out.println("RasberryHandler does not handle " + request);
                successor.handleRequest(request);
            }
        }
    }
}
