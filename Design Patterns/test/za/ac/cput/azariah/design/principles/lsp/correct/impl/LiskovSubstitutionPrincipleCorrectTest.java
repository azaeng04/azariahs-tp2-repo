/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.lsp.correct.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.design.principles.lsp.correct.Transport;
import za.ac.cput.azariah.design.principles.lsp.correct.config.AppConfig;

/**
 *
 * @author Ronald
 */
public class LiskovSubstitutionPrincipleCorrectTest {
    private static ApplicationContext ctx;
    private static Transport car;
    private static Transport bus;
    private static Transport bike;
    private static Transport unicycle;
    
    public LiskovSubstitutionPrincipleCorrectTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (Transport)ctx.getBean("car");
        bus = (Transport)ctx.getBean("bus");
        bike = (Transport)ctx.getBean("bike");
        unicycle = (Transport)ctx.getBean("unicycle");
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
    public void testTransport() {        
        List<Transport> transportType = new ArrayList<Transport>();
        
        transportType.add(car);
        transportType.add(bus);        
        
        for (Transport transport : transportType) {
            assertEquals("Has motor", transport.hasMotor());
        }
        
    }
    
    @Test(expectedExceptions=UnsupportedOperationException.class)
    public void testNoneMotors() {
        List<Transport> transportType = new ArrayList<Transport>();
        
        transportType.add(bike); //Does not have a motor
        transportType.add(unicycle); //Does not have a motor
        
        for (Transport transport : transportType) {
            assertEquals("Has no motor", transport.hasMotor());
        }
    }
}
