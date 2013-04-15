/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question03;

import com.question03.design.principles.ocp.violation.config.AppConfig;
import com.question03.design.principles.ocp.violation.impl.CalculatorAddedImpl;
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
public class OpenCloseViolationTest {

    private static ApplicationContext ctx;
    private static CalculatorAddedImpl calculator;

    public OpenCloseViolationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calculator = (CalculatorAddedImpl) ctx.getBean("calc_new");
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
    public void testOCPViolate() {
        int sum = calculator.add(2, 2);
        assertEquals(sum, 4);
    }
}