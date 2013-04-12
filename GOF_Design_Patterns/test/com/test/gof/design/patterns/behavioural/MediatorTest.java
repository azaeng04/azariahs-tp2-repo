/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.mediator.AmericanSeller;
import com.gof.design.patterns.behavioural.mediator.Buyer;
import com.gof.design.patterns.behavioural.mediator.DollarConverter;
import com.gof.design.patterns.behavioural.mediator.FrenchBuyer;
import com.gof.design.patterns.behavioural.mediator.Mediator;
import com.gof.design.patterns.behavioural.mediator.SwedishBuyer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class MediatorTest {
    
    public MediatorTest() {
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
    public void testMediator() {
        Mediator mediator = new Mediator();
        
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);

        float sellingPriceInDollars = 10.0f;
        
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        
        float swedishBidInKrona = 55.0f;
        while (!swedishBuyer.attemptToPurchase(swedishBidInKrona)) {
            swedishBidInKrona += 15.0f;
        }
        
        float frenchBidInEuros = 3.0f;
        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5f;
        }
    }
}