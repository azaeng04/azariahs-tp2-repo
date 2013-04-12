/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.strategy.Context;
import com.gof.design.patterns.behavioural.strategy.HikeStrategy;
import com.gof.design.patterns.behavioural.strategy.SkiStrategy;
import com.gof.design.patterns.behavioural.strategy.Strategy;
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
public class StrategyTest {
    
    public StrategyTest() {
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
    public void testStrategy() {
        int temperatureInF = 60;
        
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());
        
        Strategy HikeStrategy = new HikeStrategy();
        context = new Context(temperatureInF, HikeStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
    }
}