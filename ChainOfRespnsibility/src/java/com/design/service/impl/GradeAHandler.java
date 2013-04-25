/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public class GradeAHandler extends GradeHandler{

    public void handleRequest(int grade) {
        if (grade >= 75) {
            System.out.println("Your grade is an A");
        } else {
            if (successor!=null) {
                successor.handleRequest(grade);
            }
        }
    }
    
}
