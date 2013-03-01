/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.lsp.correct.impl;

import za.ac.cput.azariah.design.principles.lsp.correct.Transport;

/**
 *
 * @author Ronald
 */
public class BikeImpl implements Transport{

    @Override
    public String hasMotor() {
        return "Has no motor";
    }
    
}
