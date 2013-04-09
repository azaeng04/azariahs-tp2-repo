/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.principles.polymorphism.impl;

import com.design.principles.isp.violation.CalculateShape;

/**
 *
 * @author Ronald
 */
public class SquareImpl implements CalculateShape{

    @Override
    public double getArea(double s1) {        
        return Math.pow(s1, 2);
    }

    @Override
    public double getArea(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1) {
        double result = 0;
        for (int i = 0; i < 4; i++) {
           result += s1;
        }
        return result;
    }

    @Override
    public double getPerimeter(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getArea(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
