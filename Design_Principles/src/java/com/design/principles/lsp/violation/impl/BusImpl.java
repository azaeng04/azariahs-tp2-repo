/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.principles.lsp.violation.impl;

import com.design.principles.lsp.violation.Transport;

/**
 *
 * @author Ronald
 */
public class BusImpl implements Transport{

    @Override
    public String hasMotor() {
        return "Has motor";
    }
    
}
