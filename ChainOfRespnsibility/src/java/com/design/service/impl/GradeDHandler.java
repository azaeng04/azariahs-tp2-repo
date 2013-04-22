/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

/**
 *
 * @author 210192461
 */
public class GradeDHandler extends GradeHandler {

    public GradeDHandler() {
    }

    @Override
    public String handleRequest(int grade) {
        String grading = "";
        if (grade >= 60) {
            grading = "D";
        } else {
            if (successor != null) {
                grading = successor.handleRequest(grade);
            }
        }
        return grading;
    }
}
