/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.crud;

import com.store.feed.app.factory.ProductSpecialFactory;
import com.store.feed.domain.ProductSpecial;
import com.store.feed.service.crud.ProductSpecialCrudService;
import java.math.BigDecimal;
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
public class ProductSpecialCrudTest {
   private static ApplicationContext ctx;
    private static ProductSpecialCrudService productSpecialCrudService;
    private static Long productSpecialID;

    public ProductSpecialCrudTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        productSpecialCrudService = (ProductSpecialCrudService) ctx.getBean("ProductSpecialCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<ProductSpecial> productSpecials = productSpecialCrudService.findAll();
        productSpecialCrudService.removeMultipleEntities(productSpecials);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void createProductSpecial() {
        ProductSpecial productSpecial = new ProductSpecialFactory.Builder("LAM_82918")
                .setDiscountPercentage(new BigDecimal("10"))
                .setStartDate(new DateTime(2013, 5, 6, 0, 0).toDate())
                .setEndDate(new DateTime(2013, 5, 15, 0, 0).toDate())
                .setSpecialDescription("")
                .setSpecialDiscountValue(new BigDecimal("0"))
                .buildProductSpecial();
        
        productSpecialCrudService.persist(productSpecial);

        productSpecialID = productSpecial.getId();
    }

    @Test(dependsOnMethods = "createProductSpecial")
    public void readProductSpecial() {
        ProductSpecial productSpecial = productSpecialCrudService.findById(productSpecialID);

        assertEquals(productSpecial.getProductNumber(), "LAM_82918");
    }

    @Test(dependsOnMethods = "createProductSpecial")
    public void readCategories() {
        List<ProductSpecial> productSpecials = productSpecialCrudService.findAll();

        assertTrue(productSpecials.size() > 0);
    }

    @Test(dependsOnMethods = "createProductSpecial")
    public void updateProductSpecial() {
        ProductSpecial productSpecial = productSpecialCrudService.findById(productSpecialID);

        productSpecial.setDiscountPercentage(new BigDecimal("25"));

        productSpecialCrudService.merge(productSpecial);

        ProductSpecial productSpecial1 = productSpecialCrudService.findById(productSpecialID);

        assertEquals(productSpecial1.getDiscountPercentage(), new BigDecimal("25"));
    }

    @Test(dependsOnMethods = "readProductSpecial")
    public void deleteProductSpecial() {
        ProductSpecial productSpecial = productSpecialCrudService.findById(productSpecialID);

        productSpecialCrudService.remove(productSpecial);

        ProductSpecial productSpecial1 = productSpecialCrudService.findById(productSpecialID);

        assertNull(productSpecial1);
    }
}