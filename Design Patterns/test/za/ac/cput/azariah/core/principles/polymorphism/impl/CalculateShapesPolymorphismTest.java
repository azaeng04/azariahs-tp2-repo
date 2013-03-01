/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.core.principles.polymorphism.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.core.principles.polymorphism.CalculateShape;
import za.ac.cput.azariah.core.principles.polymorphism.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class CalculateShapesPolymorphismTest {
    private static ApplicationContext ctx;
    private static CalculateShape square;
    private static CalculateShape triangle;
    
    public CalculateShapesPolymorphismTest() {
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
    public void testSquare() {
        assertEquals(25.0, square.getArea(5));
        assertEquals(20.0, square.getPerimeter(5));
    }
    
    @Test
    public void testTriangle() {
        assertEquals(5.0, triangle.getArea(5, 2));
        assertEquals(15.0, triangle.getPerimeter(5));
    }
}
