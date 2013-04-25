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

    public String handleRequest(int grade) {
        String grading = "";
        if (grade >= 65) {
            grading = "C";
        } else {
            if (successor!=null) {
                grading = successor.handleRequest(grade);
            }
        }
        return grading;
    }
}
