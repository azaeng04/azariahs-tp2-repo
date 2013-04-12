/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.state.HappyState;
import com.gof.design.patterns.behavioural.state.Person;
import com.gof.design.patterns.behavioural.state.SadState;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class StateTest {
    
    public StateTest() {
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
    public void testState() {
        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state: " + person.sayHello());
        System.out.println("Goodbye in happy state: " + person.sayGoodbye());

        person = new Person(new SadState());
        System.out.println("Hello in sad state: " + person.sayHello());
        System.out.println("Goodbye in sad state: " + person.sayGoodbye());
    }
}