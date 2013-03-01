/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.dip.correct.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.design.principles.dip.correct.Wheels;
import za.ac.cput.azariah.design.principles.dip.correct.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class DependencyInversionPrincipleCorrectTest {
    private static ApplicationContext ctx;
    private static Wheels fourWheels;
    private static Wheels twoWheels;
    
    public DependencyInversionPrincipleCorrectTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fourWheels = (Wheels)ctx.getBean("fourWheels");
        twoWheels = (Wheels)ctx.getBean("twoWheels");
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
