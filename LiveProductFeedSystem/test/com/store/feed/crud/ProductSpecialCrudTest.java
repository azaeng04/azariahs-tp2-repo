/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.crud;

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
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductSpecialCrudService;
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
public class ProductSpecialCrudTest {
   private static ApplicationContext ctx;
    private static ProductSpecialCrudService productSpecialCrudService;
    private static CategoryCrudService categoryCrudService;
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
        categoryCrudService = (CategoryCrudService)ctx.getBean("CategoryCrudService");
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
    public void createProductSpecial() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2017, 8, 9, 0, 0).toDate(), new DateTime(2017, 9, 9, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_02918", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "BKS_02918", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);
        
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
        
        Category category = CategoryFactory.createCategory("Protein", "PRN_02938", null);
        
        product1.setCategory(category);
        
        products.add(product1);
        
        category.setProducts(products);
        
        categoryCrudService.persist(category);
        
        ProductSpecial productSpecial = new ProductSpecialFactory.Builder(product1)
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
        Product product = productSpecial.getProduct();
        
        assertEquals(product.getProductNumber(), "LAM_82918");
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