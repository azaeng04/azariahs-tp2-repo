/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public abstract class GradeHandler {
    GradeHandler successor;

    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(int grade);
}
