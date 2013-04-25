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

    public String handleRequest(int grade) {
        String grading = "";
        if (grade >= 75) {
            grading = "A";
        } else {
            if (successor!=null) {
                grading = successor.handleRequest(grade);
            }
        }
        return grading;
    }
    
}
