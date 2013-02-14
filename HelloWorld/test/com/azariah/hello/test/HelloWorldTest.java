/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.test;

import com.azariah.hello.HelloWorld;
import com.azariah.hello.HelloWorldImpl;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210192461
 */
public class HelloWorldTest {
    private HelloWorld helloWorld;
    public HelloWorldTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testHelloWorld() {
         helloWorld = new  HelloWorldImpl();
         String hello = helloWorld.getString();
         Assert.assertEquals(hello, "Hello World");
     }

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
}
