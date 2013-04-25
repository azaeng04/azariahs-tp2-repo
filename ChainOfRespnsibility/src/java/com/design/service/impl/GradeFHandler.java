/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public class GradeFHandler extends GradeHandler {

    public void handleRequest(int grade) {
        if (grade < 55) {
            System.out.println("Your grade is a F");
        } else {
            if (successor != null) {
                successor.handleRequest(grade);
            }
        }
    }
}
