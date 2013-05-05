/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.service;

import com.store.feed.service.ProductsInCategoryService;
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
public class TemplateServiceTest {
    private static ApplicationContext ctx;
    private static ProductsInCategoryService productsInCategoryService;
    
    public TemplateServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        productsInCategoryService = (ProductsInCategoryService)ctx.getBean("ProductsInCategoryService");
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