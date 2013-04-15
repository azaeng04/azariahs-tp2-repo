/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question01.core.principles.encapsulation.impl;

import com.question01.core.principles.encapsulation.User;

/**
 *
 * @author Ronald
 */
public class UserImpl implements User {
    private String username; //Encapsulated field
    
    public UserImpl() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public double calcBalance(String username) {
        double bal = 20;
        for (int i = 0; i < username.length(); i++) {
            bal += bal + bal;
        }
        return (bal);
    }
}
