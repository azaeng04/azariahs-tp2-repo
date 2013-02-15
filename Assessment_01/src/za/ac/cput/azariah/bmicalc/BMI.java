/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.bmicalc;

/**
 *
 * @author Ronald
 */
public interface BMI{
    public float calcBMI(float mass, float height);
    public double calcBMI(double mass, double height);
    public boolean aboveAvg(double bmi);
    public int weightStatus(double bmi);
    public void randomBMI(int times);
    public boolean compareGroups(double grp1[], double grp2[]);
    public double calcMultipleBMI(double weight[], double height[]);
}
