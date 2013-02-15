/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.bmicalc.impl;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.bmicalc.BMI;

/**
 *
 * @author Ronald
 */
public class BMIimplNGTest {
    private BMI bmi = null;
    public BMIimplNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        bmi = null;
    }

    //Deliberately fail a test
    @Test
    public void testFail(){
        bmi = new BMIimpl();
        bmi.randomBMI(200);
        System.out.println("Method 12 - testTimeout()");
        fail();
    }
    
    //Ignore test
    @Test(enabled=false)
    public void testCalcMultipleBMI(){
        System.out.println("Method 11 - testCalcMultipleBMI()");
        bmi = new BMIimpl();
        bmi.calcMultipleBMI(new double [] {50, 60, 70}, new double [] {1.68, 1.7, 1.8});
    }
    
    //Assertion of timeout
    @Test(timeOut=10000)
    public void testTimeout(){
        bmi = new BMIimpl();
        bmi.randomBMI(200);
        System.out.println("Method 9 - testTimeout()");
    }
    
    //Assertion of exception
    @Test(expectedExceptions=ArithmeticException.class)
    public void testException(){
        System.out.println("Method 8 - testException()");
        bmi = new BMIimpl();
        double bmiInx = bmi.calcBMI(76, 0);        
    }
    
    //Assertion of equality
    @Test
    public void testObjEquality(){
        BMIimpl bmiInx = null;
        System.out.println("Method 7 - testObjEquality()");
        assertSame(bmiInx, bmi);
    }
    
    //Assertion of truth
    @Test
    public void testWeightStatusAboveAvg(){
        bmi = new BMIimpl();
        double bmiInx = bmi.calcBMI(76, 170.8);
        System.out.println("Method 6 - testWeightStatusAboveAvg()");
        assertTrue(bmi.aboveAvg(bmiInx));
    }
    
    //Assertion of falsity
    @Test
    public void testWeightStatusBelowOrEqualAvg(){
        bmi = new BMIimpl();
        double bmiInx = bmi.calcBMI(63.5, 170.8);
        System.out.println("Method 5 - testWeightStatusBelowOrEqualAvg()");
        assertFalse(bmi.aboveAvg(bmiInx));
    }
    
    //Assertion of integer values
    @Test
    public void testBMIWeightStatus(){
        bmi = new BMIimpl();
        double bmiInx = bmi.calcBMI(81, 1.8);
        System.out.println("Method 4 - testBMIWeightStatus()");
        assertEquals(bmi.weightStatus(bmiInx), 3);
    }
    
    //Assertion of double values
    @Test
    public void testBMIcalcDouble(){
        bmi = new BMIimpl();
        double bmiInx = bmi.calcBMI(63.5, 170.8);
        final double DELTA = 0.01;
        System.out.println("Method 3 - testBMIcalcDouble()");
        assertEquals(bmiInx, 21.77, DELTA);
    }
    
    //Assertion of floating point values
    @Test
    public void testBMIcalcFloat(){
        bmi = new BMIimpl();
        float bmiInx = bmi.calcBMI(63, 170);
        final double DELTA = 0.1;
        System.out.println("Method 2 - testBMIcalcFloat()");
        assertEquals(bmiInx, 21.8, DELTA);
    }
    
    //Assertion of null object
    @Test
    public void testBMIobj(){        
        System.out.println("Method 1 - testBMIobj()");        
        System.out.println("BMI object is: " + bmi);
        assertNull(bmi, "New instance BMIimpl object needs made on bmi");        
    }
}
