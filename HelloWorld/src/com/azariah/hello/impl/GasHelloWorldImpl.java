/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.impl;

import com.azariah.hello.GasHelloWorld;

/**
 *
 * @author 210192461
 */
public class GasHelloWorldImpl implements GasHelloWorld {

    public GasHelloWorldImpl() {
    }

    @Override
    public String getString() {
        return "Hello Gas World";
    }

    @Override
    public String getName() {
        return "Gas World";
    }
    
    
}
