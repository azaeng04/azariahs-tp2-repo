/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.encapsulation.impl;

import static org.testng.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.core.principles.encapsulation.User;
import za.ac.cput.azariah.core.principles.encapsulation.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class UserEncapsulationTest {
    private static ApplicationContext ctx;
    private static User user;
    
    public UserEncapsulationTest() {
    }

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

    /**
     * Test of getUsername method, of class UserImpl.
     */
    @Test
    public void testUser() {
        assertEquals(540.0, user.calcBalance("Jon"));
    }
}
