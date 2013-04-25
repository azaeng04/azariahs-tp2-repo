/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question03;

import com.question03.design.principles.dip.violation.config.AppConfig;
import com.question03.design.principles.dip.violation.impl.FourWheelsImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class DependencyInversionViolateTest {

    private static ApplicationContext ctx;
    private static FourWheelsImpl fourWheels;

    public DependencyInversionViolateTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fourWheels = (FourWheelsImpl) ctx.getBean("fourWheels");
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
    public void testDIPViolate() {
        String noWheels = fourWheels.getWheels();
        assertEquals(noWheels, "Uses four wheels");
    }
}