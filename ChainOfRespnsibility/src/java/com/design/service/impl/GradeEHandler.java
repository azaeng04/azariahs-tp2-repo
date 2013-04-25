/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public class GradeEHandler extends GradeHandler {

    public void handleRequest(int grade) {
        String grading = "";
        if (grade >= 55) {
            System.out.println("Your grade is an E");
        } else {
            if (successor != null) {
                successor.handleRequest(grade);
            }
        }
    }
}
