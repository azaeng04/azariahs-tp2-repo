/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.isp.correct.impl;

import com.question03.design.principles.isp.correct.CalculateShape;

/**
 *
 * @author Ronald
 */
public class CircleImpl implements CalculateShape{

    @Override
    public double getArea(double s1) {
        double result = Math.PI * Math.pow(s1, 2);
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public double getArea(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getArea(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1) {
        double result = 2*(Math.PI * s1);
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public double getPerimeter(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
