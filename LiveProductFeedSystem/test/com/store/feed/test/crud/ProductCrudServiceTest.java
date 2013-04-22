/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.crud;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductStatus;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ronald
 */
public class ProductCrudServiceTest {
    private static ApplicationContext ctx;
    private static Long productID;
    
    public ProductCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        
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
    public void createProduct() {
        List<Product> products = null;
        Category category = CategoryFactory.createCategory("Long life", "LF_92019", products);
        ProductLifespan productLifespan = ProductLifespanFactory.createProductLifespan(new DateTime(2017, 12, 12, 0, 0).toDate(), new DateTime(2018, 12, 12, 0, 0).toDate());
        ProductStatus productStatus = null;
        Product product = new ProductFactory.Builder("APJM_02938", "Apricot Jam", 500)
                .setCategory(category)
                .setIsWasted(Boolean.FALSE)
                .setOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan)
                .setProductPictureURL("apricot_jam.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .setProductStatus(productStatus)
                .buildProduct();
    }
    
    @Test
    public void readProduct() {
        
    }
    
    @Test
    public void readProducts() {
        
    }
    
    @Test
    public void updateProduct() {
        
    }
    
    @Test
    public void deleteProduct() {
        
    }
}