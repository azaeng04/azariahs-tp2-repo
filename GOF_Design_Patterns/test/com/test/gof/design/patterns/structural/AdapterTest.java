/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.structural;

import com.gof.design.patterns.structural.adapter.TemperatureClassReporter;
import com.gof.design.patterns.structural.adapter.TemperatureInfo;
import com.gof.design.patterns.structural.adapter.TemperatureObjectReporter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Azariahs
 */
public class AdapterTest {
    
    public AdapterTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
    }
    
    @Test
    public void testAdapter() {
        //class adapter
        TemperatureInfo temperatureClassReporter = new TemperatureClassReporter();
        testTempInfo(temperatureClassReporter, 0, -18, -28);
        testTempInfo(temperatureClassReporter, 85, 29, -1);
        
        //object adapter
        TemperatureInfo temperatureObjectReporter = new TemperatureObjectReporter();
        testTempInfo(temperatureObjectReporter, 0, -18, -28);
        testTempInfo(temperatureObjectReporter, 85, 29, -1);
    }
    
    private void testTempInfo(TemperatureInfo temperatureInfo, int setFahrenheit, double expResult1, double expResult2) {
        temperatureInfo.setTemperatureInC(setFahrenheit);
        double result1 = Math.round(temperatureInfo.getTemperatureInC());
        double result2 = Math.round(temperatureInfo.getTemperatureInF());
        assertEquals(result1, expResult1);
        assertEquals(result2, expResult2);
    }
     
}