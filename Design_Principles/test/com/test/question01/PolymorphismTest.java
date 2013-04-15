/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question01;

import com.question01.core.principles.polymorphism.config.AppConfig;
import com.question01.core.principles.polymorphism.CalculateShape;
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
public class PolymorphismTest {
    private static ApplicationContext ctx;
    private static CalculateShape square;
    public PolymorphismTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        square = (CalculateShape)ctx.getBean("square");
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
    public void testPolymorphism() {
        double squareArea = square.getArea(5);
        double squarePerimeter = square.getPerimeter(5);

        assertEquals(squareArea, 25.0);
        assertEquals(squarePerimeter, 20.0);
    }
}