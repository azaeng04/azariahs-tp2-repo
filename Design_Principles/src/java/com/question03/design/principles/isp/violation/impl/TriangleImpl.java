/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.isp.violation.impl;

import com.question03.design.principles.isp.violation.CalculateShape;

/**
 *
 * @author Ronald
 */
public class TriangleImpl implements CalculateShape{

    @Override
    public double getArea(double s1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getArea(double s1, double s2) {
        double result = s1 * s2 / 2;
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public double getArea(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter(double s1, double s2, double s3) {
        double result = s1 + s2 + s3;
        result = Math.round(result * 100.0)/100.0;
        return result;
    }
}
