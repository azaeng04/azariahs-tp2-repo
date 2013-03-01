/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.lsp.violation.impl;

import za.ac.cput.azariah.design.principles.lsp.violation.Transport;

/**
 *
 * @author Ronald
 */
public class CarImpl implements Transport{

    @Override
    public String hasMotor() {
        return "Has motor";
    }
    
}
