/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.service;

import com.store.feed.service.ProductServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/**
 *
 * @author Ronalds
 */
public class ProductLocationsServiceTest {
    private static ApplicationContext ctx;
    private static ProductServices productServices;
    
    public ProductLocationsServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        productServices = (ProductServices)ctx.getBean("ProductServices");
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
    public void testFor() {
        
    }
}