/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.creational;

import com.gof.design.patterns.creational.factory.Animal;
import com.gof.design.patterns.creational.factory.AnimalFactory;
import com.gof.design.patterns.creational.factory.Cat;
import com.gof.design.patterns.creational.factory.Dog;
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
public class FactoryTest {
    
    public FactoryTest() {
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
    public void testForFactory() {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory();
        
        Animal dog = (Dog)animalFactory.getAnimal("canine");
        Animal cat = (Cat)animalFactory.getAnimal("feline");
        
        assertEquals(dog.makeSound(), "Woof");
        assertEquals(cat.makeSound(), "Meow");
    }
}