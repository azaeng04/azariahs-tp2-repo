/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.creational;

import com.gof.design.patterns.creational.builder.ItalianMealBuilder;
import com.gof.design.patterns.creational.builder.JapaneseMealBuilder;
import com.gof.design.patterns.creational.builder.Meal;
import com.gof.design.patterns.creational.builder.MealBuilder;
import com.gof.design.patterns.creational.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
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
    public void testBuilder() {
        MealBuilder italianMealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(italianMealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        
        assertEquals(meal.getDrink(), "Red wine");
        assertEquals(meal.getMainCourse(), "Pizza");
        assertEquals(meal.getSide(), "Bread");
        
        MealBuilder japaneseMealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(japaneseMealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        
        assertEquals(meal.getDrink(), "Sake");
        assertEquals(meal.getMainCourse(), "Chicken teriyaki");
        assertEquals(meal.getSide(), "Miso soup");
    }
}