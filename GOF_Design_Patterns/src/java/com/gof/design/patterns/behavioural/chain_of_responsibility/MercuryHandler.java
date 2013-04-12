/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.chain_of_responsibility;

/**
 *
 * @author Ronald
 */
public class MercuryHandler extends PlanetHandler{

    @Override
    public void handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.MERCURY) {
            System.out.println("MercuryHandler handles " + request);
            System.out.println("Mercury is hot");
        } else {
            System.out.println("MercuryHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
