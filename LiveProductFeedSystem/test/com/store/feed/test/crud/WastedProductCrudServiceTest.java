/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.crud;

import com.store.feed.app.factory.WastedProductFactory;
import com.store.feed.domain.WastedProduct;
import com.store.feed.service.crud.WastedProductCrudService;
import java.math.BigDecimal;
import java.util.List;
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
public class WastedProductCrudServiceTest {

    private static ApplicationContext ctx;
    private static WastedProductCrudService wastedProductCrudService;
    private static Long wastedProductID;

    public WastedProductCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        wastedProductCrudService = (WastedProductCrudService) ctx.getBean("WastedProductCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<WastedProduct> categories = wastedProductCrudService.findAll();
        wastedProductCrudService.removeMultipleEntities(categories);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void createWastedProduct() {
        WastedProduct wastedProduct = new WastedProductFactory.Builder("LAM_82918")
                .setDescription("Product printing incorrect")
                .setWasteDiscountPercentage(new BigDecimal("75"))
                .setWasteDiscountValue(new BigDecimal("0"))
                .setWastedQuantity(25)
                .buildProduct();
        
        wastedProductCrudService.persist(wastedProduct);

        wastedProductID = wastedProduct.getId();
    }

    @Test(dependsOnMethods = "createWastedProduct")
    public void readWastedProduct() {
        WastedProduct wastedProduct = wastedProductCrudService.findById(wastedProductID);

        assertEquals(wastedProduct.getProductNumber(), "LAM_82918");
    }

    @Test(dependsOnMethods = "createWastedProduct")
    public void readCategories() {
        List<WastedProduct> wastedProducts = wastedProductCrudService.findAll();

        assertTrue(wastedProducts.size() > 0);
    }

    @Test(dependsOnMethods = "createWastedProduct")
    public void updateWastedProduct() {
        WastedProduct wastedProduct = wastedProductCrudService.findById(wastedProductID);

        wastedProduct.setDescription("Product printing incorrect and packaging is torn");

        wastedProductCrudService.merge(wastedProduct);

        WastedProduct wastedProduct1 = wastedProductCrudService.findById(wastedProductID);

        assertEquals(wastedProduct1.getDescription(), "Product printing incorrect and packaging is torn");
    }

    @Test(dependsOnMethods = "readWastedProduct")
    public void deleteWastedProduct() {
        WastedProduct wastedProduct = wastedProductCrudService.findById(wastedProductID);

        wastedProductCrudService.remove(wastedProduct);

        WastedProduct wastedProduct1 = wastedProductCrudService.findById(wastedProductID);

        assertNull(wastedProduct1);
    }
}