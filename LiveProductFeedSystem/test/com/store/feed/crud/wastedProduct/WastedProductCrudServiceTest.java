/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.crud.wastedProduct;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.app.factory.WastedProductFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.WastedProduct;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.WastedProductCrudService;
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
public class WastedProductCrudServiceTest {

    private static ApplicationContext ctx;
    private static WastedProductCrudService wastedProductCrudService;
    private static CategoryCrudService categoryCrudService;
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
        categoryCrudService = (CategoryCrudService) ctx.getBean("CategoryCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<WastedProduct> wastedProducts = wastedProductCrudService.findAll();
        List<Category> categories = categoryCrudService.findAll();
        wastedProductCrudService.removeMultipleEntities(wastedProducts);
        categoryCrudService.removeMultipleEntities(categories);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void createWastedProduct() {
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
                .setIsWasted(Boolean.TRUE)
                .setIsOnSpecial(Boolean.FALSE)
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

        WastedProduct wastedProduct = new WastedProductFactory.Builder(product1)
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
        Product product = wastedProduct.getProduct();
        
        assertEquals(product.getProductNumber(), "LAM_82918");
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