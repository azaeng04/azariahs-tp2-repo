/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.polymorphism;

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
