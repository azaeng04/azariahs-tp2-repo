/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.gof.design.patterns.behavioural;

import com.gof.design.patterns.behavioural.chain_of_responsibility.EarthHandler;
import com.gof.design.patterns.behavioural.chain_of_responsibility.MercuryHandler;
import com.gof.design.patterns.behavioural.chain_of_responsibility.PlanetEnum;
import com.gof.design.patterns.behavioural.chain_of_responsibility.PlanetHandler;
import com.gof.design.patterns.behavioural.chain_of_responsibility.VenusHandler;
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
        PlanetHandler chain = setUpChain();
        
        chain.handleRequest(PlanetEnum.VENUS);
        System.out.println();
        chain.handleRequest(PlanetEnum.MERCURY);
        System.out.println();
        chain.handleRequest(PlanetEnum.EARTH);
        System.out.println();
        chain.handleRequest(PlanetEnum.JUPITER);
    }

    private PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();
        
        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        
        return mercuryHandler;
    }
}