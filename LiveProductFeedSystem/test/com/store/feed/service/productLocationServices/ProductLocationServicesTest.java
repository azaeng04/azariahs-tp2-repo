/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.productLocationServices;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.service.ProductLocationServices;
import com.store.feed.service.ProductServices;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.impl.ProductLocationServicesImpl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronalds
 */
public class ProductLocationServicesTest {
    private static ApplicationContext ctx;
    private static CategoryCrudService categoryCrudService;
    private static ProductLocationServices productLocationServices;
    
    public ProductLocationServicesTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        categoryCrudService = (CategoryCrudService)ctx.getBean("CategoryCrudService");
        productLocationServices = (ProductLocationServices)ctx.getBean("ProductLocationServices");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<Category> categories = categoryCrudService.findAll();
        categoryCrudService.removeMultipleEntities(categories);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getProductLocations method, of class ProductLocationServicesImpl.
     */
    @Test
    public void testGetProductLocations() {
        createCategory();
        
        List<ProductLocation> productLocations = productLocationServices.getProductLocations("APR_03918");
        
        assertEquals(productLocations.get(0).getProductLocationNumber(), "BKS_17354");
        assertEquals(productLocations.get(1).getProductLocationNumber(), "INS_95735");
    }
    
    public void createCategory() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_17354", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_95735", 20);
        
        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);
        
        Product product1 = new ProductFactory.Builder("APR_03918")
                .setProductName("Apricot Jam")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("apricot_jam.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();
        
        Category category = CategoryFactory.createCategory("Long life", "LLF_02938", null);
        
        product1.setCategory(category);
        
        products.add(product1);
        
        category.setProducts(products);
        
        categoryCrudService.persist(category);
    }
}