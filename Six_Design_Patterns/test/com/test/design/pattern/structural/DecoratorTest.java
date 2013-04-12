/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.design.pattern.structural;

import com.design.pattern.structural.decorator.HatDecorator;
import com.design.pattern.structural.decorator.JeansDecorator;
import com.design.pattern.structural.decorator.Person;
import com.design.pattern.structural.decorator.ShoesDecorator;
import com.design.pattern.structural.decorator.Stylist;
import com.design.pattern.structural.decorator.TshirtDecorator;
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
        Person stylist = new Stylist();
        stylist.dress();
        
        stylist = new HatDecorator(stylist);
        stylist.dress();
        System.out.println();
        stylist = new TshirtDecorator(stylist);
        stylist.dress();
        System.out.println();
        stylist = new JeansDecorator(stylist);
        stylist.dress();
        System.out.println();
        stylist = new ShoesDecorator(stylist);
        stylist.dress();
    }
}