/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.srp.correct.impl;

import com.question03.design.principles.srp.correct.CalculateArea;

/**
 *
 * @author Ronald
 */
public class CalculateSquareArea implements CalculateArea{

    @Override
    public double getArea(double s1) {
        return s1*s1;
    }

    @Override
    public double getArea(double s1, double s2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea(double s1, double s2, double s3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
