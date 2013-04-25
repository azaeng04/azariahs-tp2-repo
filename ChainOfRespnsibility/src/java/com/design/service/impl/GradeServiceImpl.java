/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.service.impl;

import com.design.service.GradeService;

/**
 *
 * @author 210192461
 */
public class GradeServiceImpl implements GradeService {

    @Override
    public void fetchGrade(int grade) {
        GradeHandler chain = setUpChain();
        chain.handleRequest(grade);
    }

    private GradeHandler setUpChain() {
        GradeHandler gradeAHandler = new GradeAHandler();
        GradeHandler gradeBHandler = new GradeBHandler();
        GradeHandler gradeCHandler = new GradeCHandler();
        GradeHandler gradeDHandler = new GradeDHandler();
        GradeHandler gradeEHandler = new GradeEHandler();
        GradeHandler gradeFHandler = new GradeFHandler();

        gradeAHandler.setSuccessor(gradeBHandler);
        gradeBHandler.setSuccessor(gradeCHandler);
        gradeCHandler.setSuccessor(gradeDHandler);
        gradeDHandler.setSuccessor(gradeEHandler);
        gradeEHandler.setSuccessor(gradeFHandler);

        return gradeAHandler;
    }
}
