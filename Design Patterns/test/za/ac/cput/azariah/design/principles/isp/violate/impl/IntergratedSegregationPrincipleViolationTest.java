/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.isp.violate.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.design.principles.isp.violation.CalculateShape;
import za.ac.cput.azariah.design.principles.isp.violation.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class IntergratedSegregationPrincipleViolationTest {
    private static ApplicationContext ctx;
    private static CalculateShape circle;
    private static CalculateShape triangle;
    
    public IntergratedSegregationPrincipleViolationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        circle = (CalculateShape)ctx.getBean("circle");
        triangle = (CalculateShape)ctx.getBean("triangle");
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
    public void testCircle() {
        assertEquals(78.54, circle.getArea(5));
        assertEquals(31.42, circle.getPerimeter(5));
    }
    
    @Test
    public void testTriangle() {
        assertEquals(5.0, triangle.getArea(5, 2));
        assertEquals(15.0, triangle.getPerimeter(5));
    }
}
