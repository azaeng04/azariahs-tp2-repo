/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.inheritance.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.core.principles.inheritance.GenePool;
import za.ac.cput.azariah.core.principles.inheritance.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class ChildImplInheritanceTest {
    private static ApplicationContext ctx;
    private static GenePool child;
    
    public ChildImplInheritanceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        child = (GenePool)ctx.getBean("child");
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
    public void testChild() {
        assertEquals("Green eyes", child.greenEyes());
        assertEquals("Tall gene", child.tallGene());
    }
}
