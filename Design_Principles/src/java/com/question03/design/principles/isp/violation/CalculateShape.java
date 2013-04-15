/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.isp.violation;

/**
 *
 * @author Ronald
 */
public interface CalculateShape {
    public double getArea(double s1);
    public double getArea(double s1, double s2);
    public double getArea(double s1, double s2, double s3);
    
    public double getPerimeter(double s1);
    public double getPerimeter(double s1, double s2);
    public double getPerimeter(double s1, double s2, double s3);
}
