/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.command.Command;
import com.gof.design.patterns.behavioural.command.Dinner;
import com.gof.design.patterns.behavioural.command.DinnerCommand;
import com.gof.design.patterns.behavioural.command.Lunch;
import com.gof.design.patterns.behavioural.command.LunchCommand;
import com.gof.design.patterns.behavioural.command.MealInvoker;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class CommandTest {
    
    public CommandTest() {
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
    public void testCommand() {
        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch);
        
        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinnerCommand(dinner);
        
        MealInvoker mealInvoker = new MealInvoker(lunchCommand);
        mealInvoker.invoke();
        
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }
}