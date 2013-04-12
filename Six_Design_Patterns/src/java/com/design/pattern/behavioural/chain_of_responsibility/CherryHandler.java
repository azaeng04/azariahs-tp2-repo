/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public class CherryHandler extends IceCreamHandler{

    public void handleRequest(IceCreamEnum request) {
        if (request == IceCreamEnum.CHERRY) {
            System.out.println("CherryHandler handles " + request);
        } else {
            if (successor != null) {
                System.out.println("CerryHandler does not handle " + request);
                successor.handleRequest(request);
            }
        }
    }
}
