/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.template.CheeseBurgerMeal;
import com.gof.design.patterns.behavioural.template.HamburgerMeal;
import com.gof.design.patterns.behavioural.template.Meal;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class TemplateTest {
    
    public TemplateTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
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
    public void testTemplate() {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();
        
        System.out.println();
        
        Meal meal2 = new CheeseBurgerMeal();
        meal2.doMeal();
    }
}
