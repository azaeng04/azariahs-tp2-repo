/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.design.pattern.creational;

import com.design.pattern.creational.builder.BMWBuilder;
import com.design.pattern.creational.builder.Director;
import com.design.pattern.creational.builder.NissanBuilder;
import com.design.pattern.creational.builder.Vehicle;
import com.design.pattern.creational.builder.VehicleBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class BuilderTest {
    
    public BuilderTest() {
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
    public void testBuilder() {
        VehicleBuilder bmwBuilder = new BMWBuilder();
        Director director = new Director(bmwBuilder);
        director.constructVehicle();
        Vehicle vehicle = director.getVehicle();
        System.out.println(vehicle);
        
        VehicleBuilder nissanBuilder = new NissanBuilder();
        director = new Director(nissanBuilder);
        director.constructVehicle();
        vehicle = director.getVehicle();
        System.out.println(vehicle);
    }
}