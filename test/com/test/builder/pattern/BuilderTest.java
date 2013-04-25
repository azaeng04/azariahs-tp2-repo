/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.builder.pattern;

import com.design.pattern.builder.app.factory.MealBuilderFactory;
import com.design.pattern.builder.model.MacMeal;
import com.design.pattern.builder.service.MacMealService;
import com.design.pattern.builder.service.impl.MacMealServiceImpl;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210192461
 */
public class BuilderTest {

    private static MacMealService macMealService;

    public BuilderTest() {
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        macMealService = new MacMealServiceImpl();
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
    private void testBuilder() {
        MacMeal order = new MealBuilderFactory.Builder("McDeluxe Burger")
                .cooldrink("Fanta")
                .chips(Boolean.TRUE)
                .build();

        MacMeal meal = macMealService.placeOrder(order);
        assertEquals(meal.getCooldrink(), "Fanta");
        assertEquals(meal.getMeal(), "McDeluxe Burger");
        assertEquals(meal.getChips(), Boolean.TRUE);
    }
}