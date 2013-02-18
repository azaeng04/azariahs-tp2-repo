/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.impl;

import com.azariah.hello.HelloWorld;

/**
 *
 * @author Azariahs
 */
public class NuclearHelloWorldImpl implements HelloWorld{

    @Override
    public String getString() {
        return "Hello Nuclear World";
    }

    @Override
    public String getName() {
        return "Nuclear World";
    }
    
}
