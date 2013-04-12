/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.memento.DietInfo;
import com.gof.design.patterns.behavioural.memento.DietInfoCaretaker;
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
public class MementoTest {
    
    public MementoTest() {
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
    public void testMemento() {
        DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();
        
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumberAndWeight(2, 99);
        System.out.println(dietInfo);
        
        System.out.println("\nSaving state");
        dietInfoCaretaker.saveState(dietInfo);
        
        dietInfo.setDayNumberAndWeight(3, 98);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumberAndWeight(4, 97);
        System.out.println(dietInfo);
        
        System.out.println("\nRestoring saved state");
        dietInfoCaretaker.restoreState(dietInfo);
        System.out.println(dietInfo);
    }
}