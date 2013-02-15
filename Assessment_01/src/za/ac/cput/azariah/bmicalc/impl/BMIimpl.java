/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.bmicalc.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import za.ac.cput.azariah.bmicalc.BMI;

/**
 *
 * @author Ronald
 */
public class BMIimpl implements BMI{

    @Override
    public float calcBMI(float mass, float height) {
        if (height == 0 || mass == 0) {
            throw new ArithmeticException();
        }
        
        height *= 0.01;
        float heightSq = (float) Math.pow(height, 2);
        float bmi = (mass/heightSq);
        return bmi;
    }

    @Override
    public double calcBMI(double mass, double height) {
        if (height == 0 || mass == 0) {
            throw new ArithmeticException();
        }
        
        height *= 0.01;
        double heightSq = Math.pow(height, 2);
        double bmi = (mass/heightSq);
        return bmi;
    }

    @Override
    public boolean aboveAvg(double bmi) {
        boolean isAboveAvg = false;        
        if (bmi > 23) { isAboveAvg = true; }
        return isAboveAvg;
    }

    @Override
    public int weightStatus(double bmi) {
        int status = 2;
        if (bmi < 22) { status = 1; } 
        else if (bmi > 24) { status = 3; }
        return status;
    }

    @Override
    public void randomBMI(int times) {
        Random random = new Random();
        long startH = 1;
        long endH = 2;
        long startW = 30;
        long endW = 150;
        
        double height = 0.0;
        double weight = 0.0;
        for (int i = 0; i < times; i++) {
            height = retRandomDouble(startH, endH, random);
            weight = retRandomDouble(startW, endW, random);
        }
    }
    
    private static double retRandomDouble(long aStart, long aEnd, Random aRandom){
        if ( aStart > aEnd ) {
          throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        double fraction = (double)(range * aRandom.nextDouble());
        double randomNumber =  (double)(fraction + aStart);
        
        return randomNumber;
   }    

    @Override
    public boolean compareGroups(double[] grp1, double[] grp2) {
        boolean isEqual = true;        
        if (grp1.length == grp2.length) {
            Arrays.sort(grp1); Arrays.sort(grp2);
            for (int i = 0; i < grp1.length; i++) {                
                if (grp1[i] != grp2[i]) {
                    isEqual = false;
                }
            }
        }        
        return isEqual;        
    }

    @Override
    public double calcMultipleBMI(double[] weight, double[] height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
