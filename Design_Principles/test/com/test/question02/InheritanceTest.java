/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question02;

import com.question02.core.principles.inheritance.GenePool;
import com.question02.core.principles.inheritance.config.AppConfig;
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
public class InheritanceTest {
    private static ApplicationContext ctx;
    private static GenePool person;
    public InheritanceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (GenePool)ctx.getBean("child");
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
    public void testInheritance() {
        String eyeColour = person.blueEyes();
        String height = person.tallGene();
        
        assertEquals(eyeColour, "I have blue eyes");
        assertEquals(height, "I am tall");
    }
}