/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.creational;

import com.gof.design.patterns.creational.abstract_factory.AbstractFactory;
import com.gof.design.patterns.creational.abstract_factory.Cat;
import com.gof.design.patterns.creational.abstract_factory.Dog;
import com.gof.design.patterns.creational.abstract_factory.MammalFactory;
import com.gof.design.patterns.creational.abstract_factory.Reptile;
import com.gof.design.patterns.creational.abstract_factory.ReptileFactory;
import com.gof.design.patterns.creational.abstract_factory.Snake;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
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
    public void testAbstractFactory() {
        AbstractFactory abstractFactory = AbstractFactory.getMammalFactory();
        
        MammalFactory mammalFactory = (MammalFactory)abstractFactory.getSpeciesFactory("mammal");
        ReptileFactory reptileFactory = (ReptileFactory)abstractFactory.getSpeciesFactory("reptile");
        
        Dog dog = (Dog)mammalFactory.getAnimal("dog");
        Cat cat = (Cat)mammalFactory.getAnimal("cat");
        
        Snake snake = (Snake)reptileFactory.getAnimal("snake");
        Reptile reptile = (Reptile)reptileFactory.getAnimal("reptile");
        
        assertEquals(dog.makeSound(), "Woof");
        assertEquals(cat.makeSound(), "Meow");
        assertEquals(snake.makeSound(), "Hiss");
        assertEquals(reptile.makeSound(), "Roar");
    }
}