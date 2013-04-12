/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.design.pattern.behavioural;

import com.design.pattern.behavioural.template_method.BalanceWithdrawal;
import com.design.pattern.behavioural.template_method.Withdraw;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
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
    public void testTemplateMethod() {
        int withdraw = 200;
        BalanceWithdrawal balanceWithdrawal = new Withdraw();
        balanceWithdrawal.doWithdrawal(withdraw);
        
        withdraw = 3000;
        balanceWithdrawal.doWithdrawal(withdraw);
    }
}