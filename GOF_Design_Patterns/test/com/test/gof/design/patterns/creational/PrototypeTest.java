/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.creational;

import com.gof.design.patterns.creational.prototype.Dog;
import com.gof.design.patterns.creational.prototype.Person;
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
public class PrototypeTest {
    
    public PrototypeTest() {
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
    public void testPrototype() {
        Person person1 = new Person("Fred");
        Person person2 = (Person)person1.doClone();
        
        assertNotEquals(person1, person2);
        
        Dog dog1 = new Dog("Woof");
        Dog dog2 = (Dog)dog1.doClone();
        
        assertNotEquals(dog1, dog2);
    }
}