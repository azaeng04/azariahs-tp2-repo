/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question03;

import com.question03.design.principles.isp.correct.CalculateShape;
import com.question03.design.principles.isp.correct.config.AppConfig;
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
public class IntegrationSegregationCorrectTest {
    private static ApplicationContext ctx;
    private static CalculateShape triangle;
    public IntegrationSegregationCorrectTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
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
    public void testISPCorrect() {
        double triangleArea = triangle.getArea(10, 5);
        double trianglePerimeter = triangle.getPerimeter(5, 5, 5);
        assertEquals(triangleArea, 25.0);
        assertEquals(trianglePerimeter, 15.0);
    }
}