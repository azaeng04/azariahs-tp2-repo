/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.service;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.app.factory.ProductSpecialFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.ProductSpecial;
import com.store.feed.service.ProductServices;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductSpecialCrudService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.joda.time.DateTime;
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
public class ProductsOnSpecialServiceTest {

    private static ApplicationContext ctx;
    private static ProductSpecialCrudService productSpecialCrudService;
    private static CategoryCrudService categoryCrudService;
    private static ProductServices productServices;

    public ProductsOnSpecialServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        productServices = (ProductServices) ctx.getBean("ProductServices");
        categoryCrudService = (CategoryCrudService) ctx.getBean("CategoryCrudService");
        productSpecialCrudService = (ProductSpecialCrudService) ctx.getBean("ProductSpecialCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<ProductSpecial> productSpecials = productSpecialCrudService.findAll();
        List<Category> categories = categoryCrudService.findAll();
        categoryCrudService.removeMultipleEntities(categories);
        productSpecialCrudService.removeMultipleEntities(productSpecials);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testFor() {
        createProductSpecial();

        List<Product> products = productServices.getProductsOnSpecial();
        
        assertTrue(products.size() == 2);
    }

    public void createProductSpecial() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2017, 8, 9, 0, 0).toDate(), new DateTime(2017, 9, 9, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        List<ProductLocation> productLocations2 = new ArrayList<ProductLocation>();

        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_02918", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "BKS_02918", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        ProductLocation productLocation3 = ProductLocationFactory.createProductLocation("Back storage", "BKS_02918", 80);
        ProductLocation productLocation4 = ProductLocationFactory.createProductLocation("In the store", "BKS_02918", 20);

        productLocations2.add(productLocation3);
        productLocations2.add(productLocation4);

        Product product1 = new ProductFactory.Builder("LAM_82918")
                .setProductName("Leg of Lamb")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.TRUE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("leg_of_lamb.jpg")
                .setProductPrice(new BigDecimal("400.95"))
                .buildProduct();

        Product product2 = new ProductFactory.Builder("LCP_82918")
                .setProductName("Lamb Chops")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.TRUE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations2)
                .setProductPictureURL("lamb_chops.jpg")
                .setProductPrice(new BigDecimal("65.95"))
                .buildProduct();

        Category category = CategoryFactory.createCategory("Protein", "PRN_02938", null);

        product1.setCategory(category);
        product2.setCategory(category);

        products.add(product1);
        products.add(product2);

        category.setProducts(products);

        categoryCrudService.persist(category);

        ProductSpecial productSpecial1 = new ProductSpecialFactory.Builder("LAM_82918")
                .setDiscountPercentage(new BigDecimal("10"))
                .setStartDate(new DateTime(2013, 5, 6, 0, 0).toDate())
                .setEndDate(new DateTime(2013, 5, 15, 0, 0).toDate())
                .setSpecialDescription("")
                .setSpecialDiscountValue(new BigDecimal("0"))
                .buildProductSpecial();

        ProductSpecial productSpecial2 = new ProductSpecialFactory.Builder("LCP_82918")
                .setDiscountPercentage(new BigDecimal("10"))
                .setStartDate(new DateTime(2013, 5, 6, 0, 0).toDate())
                .setEndDate(new DateTime(2013, 5, 15, 0, 0).toDate())
                .setSpecialDescription("")
                .setSpecialDiscountValue(new BigDecimal("0"))
                .buildProductSpecial();

        List<ProductSpecial> productsOnSpecial = new ArrayList<ProductSpecial>();
        productsOnSpecial.add(productSpecial1);
        productsOnSpecial.add(productSpecial2);

        productSpecialCrudService.persistMultipleEntities(productsOnSpecial);
    }
}