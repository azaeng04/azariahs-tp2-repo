/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.crud;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.service.crud.CategoryCrudService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Ronald
 */
public class CategoryCrudServiceTest {
    private static ApplicationContext ctx;
    private static CategoryCrudService categoryCrudService;
    private static Long categoryID;
    
    public CategoryCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        categoryCrudService = (CategoryCrudService)ctx.getBean("CategoryCrudService");
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
    
    @Test
    public void createCategory() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_02918");
        
        productLocations1.add(productLocation1);
        
        Product product1 = new ProductFactory.Builder("APR_03918")
                .setProductName("Apricot Jam")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("apricot_jam.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();
        
        Category category = CategoryFactory.createCategory("Long life", "LLF_02938", products);
        
        product1.setCategory(category);
        
        products.add(product1);
        
        categoryCrudService.persist(category);
        
        categoryID = category.getId();
    }
    
    @Test
    public void readCategory() {
        Category category = categoryCrudService.findById(categoryID);
        
        assertEquals(category.getCategoryName(), "Long life");
    }
    
    @Test
    public void readCategories() {
        List<Category> categories = categoryCrudService.findAll();
        
        assertTrue(categories.size()>0);
    }
    
    @Test
    public void updateCategory() {
        Category category = categoryCrudService.findById(categoryID);
        
        category.setCategoryName("Long life products");
        
        categoryCrudService.merge(category);
        
        Category category1 = categoryCrudService.findById(categoryID);
        
        assertEquals(category1.getCategoryName(), "Long life products");
    }
    
    @Test
    public void deleteCategory() {
        Category category = categoryCrudService.findById(categoryID);
        
        categoryCrudService.remove(category);
        
        Category category1 = categoryCrudService.findById(categoryID);
        
        assertNull(category1);
    }
}