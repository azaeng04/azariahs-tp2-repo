/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public class GradeCHandler extends GradeHandler {

    public void handleRequest(int grade) {
        String grading = "";
        if (grade >= 65) {
            System.out.println("Your grade is a C");
        } else {
            if (successor != null) {
                successor.handleRequest(grade);
            }
        }
    }
}
