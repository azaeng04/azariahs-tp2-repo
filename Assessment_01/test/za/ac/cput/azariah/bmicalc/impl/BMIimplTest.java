/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.bmicalc.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.bmicalc.BMI;
import za.ac.cput.azariah.bmicalc.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class BMIimplTest {
    private static BMI bmi;
    private static ApplicationContext ctx;
    public BMIimplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        bmi = (BMI)ctx.getBean("bmi");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    //Deliberately fail a test
    @Test
    public void testFail(){         
        bmi.randomBMI(200);
        System.out.println("Method 12 - testFail()");
        fail("This is to test assertion of false pass");
    }
    
    //Ignore test
    @Test(enabled=false)
    public void testCalcMultipleBMI(){
        System.out.println("Method 11 - testCalcMultipleBMI()");         
        bmi.calcMultipleBMI(new double [] {50, 60, 70}, new double [] {1.68, 1.7, 1.8});
    }
    
    //Assertion of timeout
    @Test(timeOut=10000)
    public void testTimeout(){         
        bmi.randomBMI(200);
        System.out.println("Method 10 - testTimeout()");
    }
    
    //Assertion of exception
    @Test(expectedExceptions=ArithmeticException.class)
    public void testException(){
        System.out.println("Method 9 - testException()");         
        double bmiInx = bmi.calcBMI(76, 0);        
    }
    
    //Assertion of equality
    @Test
    public void testObjEquality(){
        BMI bmiInx = bmi;
        System.out.println("Method 8 - testObjEquality()");
        assertEquals(bmiInx, bmi);
    }
    
    //Assertion of identity
    @Test
    public void testObjIdentity(){
        BMI bmiInx = bmi;
        System.out.println("Method 7 - testObjIdentity()");
        assertSame(bmiInx, bmi);
    }
    
    //Assertion of truth
    @Test
    public void testWeightStatusAboveAvg(){         
        double bmiInx = bmi.calcBMI(76, 170.8);
        boolean status = bmi.aboveAvg(bmiInx);
        System.out.println("Method 6 - testWeightStatusAboveAvg()");
        assertTrue(status);
    }
    
    //Assertion of falsity
    @Test
    public void testWeightStatusBelowOrEqualAvg(){         
        double bmiInx = bmi.calcBMI(63.5, 170.8);
        boolean status = bmi.aboveAvg(bmiInx);
        System.out.println("Method 5 - testWeightStatusBelowOrEqualAvg()");
        assertFalse(status);
    }
    
    //Assertion of integer values
    @Test
    public void testBMIWeightStatus(){         
        double bmiInx = bmi.calcBMI(81, 1.8);
        int status = bmi.weightStatus(bmiInx);
        System.out.println("Method 4 - testBMIWeightStatus()");
        assertEquals(status, 3);
    }
    
    //Assertion of double values
    @Test
    public void testBMIcalcDouble(){         
        double bmiInx = bmi.calcBMI(63.5, 170.8);
        final double DELTA = 0.01;
        System.out.println("Method 3 - testBMIcalcDouble()");
        assertEquals(bmiInx, 21.77, DELTA);
    }
    
    //Assertion of floating point values
    @Test
    public void testBMIcalcFloat(){         
        float bmiInx = bmi.calcBMI(63, 170);
        final double DELTA = 0.1;
        System.out.println("Method 2 - testBMIcalcFloat()");
        assertEquals(bmiInx, 21.8, DELTA);
    }
    
    //Assertion of not null object
    @Test
    public void testBMIobj(){        
        System.out.println("Method 1 - testBMIobj()");
        assertNotNull(bmi, "New instance BMI object needs made on bmi");        
    }
}
