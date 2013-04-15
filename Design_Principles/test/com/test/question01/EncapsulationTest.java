/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question01;

import com.question01.core.principles.encapsulation.User;
import com.question01.core.principles.encapsulation.config.AppConfig;
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
public class EncapsulationTest {
    private static ApplicationContext ctx;
    private static User user;
    public EncapsulationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        user = (User)ctx.getBean("user");
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
    public void testEncapsulation() {
        double balance = user.calcBalance("John");
        
        assertEquals(balance, 1620.0);
    }
}