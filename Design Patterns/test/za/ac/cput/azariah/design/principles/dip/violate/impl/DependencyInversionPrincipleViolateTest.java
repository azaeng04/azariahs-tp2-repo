/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.dip.violate.impl;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.design.principles.dip.violation.Wheels;
import za.ac.cput.azariah.design.principles.dip.violation.impl.FourWheelsImpl;
import za.ac.cput.azariah.design.principles.dip.violation.impl.TwoWheelsImpl;

/**
 *
 * @author Ronald
 */
public class DependencyInversionPrincipleViolateTest {
    private static Wheels fourWheels;
    private static Wheels twoWheels;
    
    public DependencyInversionPrincipleViolateTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        fourWheels = new FourWheelsImpl();
        twoWheels = new TwoWheelsImpl();
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
    public void testWheels() {
        assertEquals("Uses four wheels", fourWheels.getWheels());
        assertEquals("Uses two wheels", twoWheels.getWheels());
    }
}
