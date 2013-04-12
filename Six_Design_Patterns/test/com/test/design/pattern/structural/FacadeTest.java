/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.design.pattern.structural;

import com.design.pattern.structural.facade.BankFacade;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class FacadeTest {
    
    public FacadeTest() {
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
    public void testFacade() {
        BankFacade bankFacade = new BankFacade();
        bankFacade.withdrawAmount(300);
        bankFacade.depositAmount(400);
    }
}