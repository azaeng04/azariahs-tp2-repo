/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.structural;

import com.gof.design.patterns.structural.flyweight.Flyweight;
import com.gof.design.patterns.structural.flyweight.FlyweightFactory;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class FlyweightTest {
    
    public FlyweightTest() {
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
    public void testFlyweight() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        
        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.createFlyweight("add");
            flyweightAdder.doMath(i, i);
            
            Flyweight flyweightMultiplier = flyweightFactory.createFlyweight("multiplier");
            flyweightMultiplier.doMath(i, i);
        }
    }     
}