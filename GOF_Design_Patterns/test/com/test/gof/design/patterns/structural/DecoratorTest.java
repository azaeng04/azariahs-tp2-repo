/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.structural;

import com.gof.design.patterns.structural.decorator.Animal;
import com.gof.design.patterns.structural.decorator.GrowlDecorator;
import com.gof.design.patterns.structural.decorator.LegDecorator;
import com.gof.design.patterns.structural.decorator.LivingAnimal;
import com.gof.design.patterns.structural.decorator.WingDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class DecoratorTest {
    
    public DecoratorTest() {
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
    public void testDecorator() {
        Animal animal = new LivingAnimal();
        animal.describe();
        
        animal = new LegDecorator(animal);
        animal.describe();
        
        animal = new WingDecorator(animal);
        animal.describe();
        
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal.describe();
    }
}