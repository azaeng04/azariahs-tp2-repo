/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.design.pattern.behavioural;

import com.design.pattern.behavioural.chain_of_responsibility.BlueBerryHandler;
import com.design.pattern.behavioural.chain_of_responsibility.CherryHandler;
import com.design.pattern.behavioural.chain_of_responsibility.IceCreamEnum;
import com.design.pattern.behavioural.chain_of_responsibility.IceCreamHandler;
import com.design.pattern.behavioural.chain_of_responsibility.RasberryHandler;
import com.design.pattern.behavioural.chain_of_responsibility.StrawberryHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
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
    public void testChainOfResponsibility() {
        IceCreamHandler chain = setupChain();
        
        chain.handleRequest(IceCreamEnum.CHERRY);
        System.out.println();
        chain.handleRequest(IceCreamEnum.STRAWBERRY);
        System.out.println();
        chain.handleRequest(IceCreamEnum.BLUEBERRY);
        System.out.println();
        chain.handleRequest(IceCreamEnum.RASBERRY);
    }

    private static IceCreamHandler setupChain() {
        CherryHandler cherryHandler = new CherryHandler();
        StrawberryHandler strawberryHandler = new StrawberryHandler();
        BlueBerryHandler blueBerryHandler = new BlueBerryHandler();
        RasberryHandler rasberryHandler = new RasberryHandler();
        
        cherryHandler.setSuccessor(strawberryHandler);
        strawberryHandler.setSuccessor(blueBerryHandler);
        blueBerryHandler.setSuccessor(rasberryHandler);
        
        return cherryHandler;
    }
}