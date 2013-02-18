/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azariah.hello.test;

import com.azariah.hello.HelloWorld;
import com.azariah.hello.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    private static HelloWorld helloWorld;
    private static ApplicationContext ctx;
    public HelloWorldTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testHelloWorld() {
         String hello = helloWorld.getString();
         Assert.assertEquals(hello, "Hello Nuclear World");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        helloWorld = (HelloWorld)ctx.getBean("hello");
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
