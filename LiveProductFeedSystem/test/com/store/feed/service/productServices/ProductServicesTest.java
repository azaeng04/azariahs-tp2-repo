/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.productServices;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.app.factory.ProductSpecialFactory;
import com.store.feed.app.factory.WastedProductFactory;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.ProductSpecial;
import com.store.feed.domain.WastedProduct;
import com.store.feed.service.ProductServices;
import com.store.feed.service.ProductServices;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductSpecialCrudService;
import com.store.feed.service.crud.WastedProductCrudService;
import com.store.feed.service.impl.ProductServicesImpl;
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
public class ProductServicesTest {

    private static ApplicationContext ctx;
    private static CategoryCrudService categoryCrudService;
    private static ProductServices productServices;
    private static ProductSpecialCrudService productSpecialCrudService;
    private static WastedProductCrudService wastedProductCrudService;

    public ProductServicesTest() {
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
        wastedProductCrudService = (WastedProductCrudService) ctx.getBean("WastedProductCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        List<WastedProduct> wastedProducts = wastedProductCrudService.findAll();
        List<ProductSpecial> productSpecials = productSpecialCrudService.findAll();
        List<Category> categories = categoryCrudService.findAll();
        productSpecialCrudService.removeMultipleEntities(productSpecials);
        wastedProductCrudService.removeMultipleEntities(wastedProducts);
        categoryCrudService.removeMultipleEntities(categories);
    }

    /**
     * Test of getProductListOnCategory method, of class ProductServicesImpl.
     */
    @Test
    public void testGetProductListOnCategory() {
        createCategory();

        List<Product> products = productServices.getProductListOnCategory("Long life");

        assertTrue(products.size() == 2);
    }

    /**
     * Test of getProductsOnSpecial method, of class ProductServicesImpl.
     */
    @Test
    public void testGetProductsOnSpecial() {
        createProductSpecial();

        List<Product> products = productServices.getProductsOnSpecial();
        
        assertTrue(products.size() == 2);
    }

    /**
     * Test of getWastedProducts method, of class ProductServicesImpl.
     */
    @Test
    public void testGetWastedProducts() {
        createWastedProducts();

        List<Product> products = productServices.getWastedProducts();
        
        assertTrue(products.size() == 2);
    }

    /**
     * Test of getProduct method, of class ProductServicesImpl.
     */
    @Test
    public void testGetProduct() {
        createCategory();
        
        Product product = productServices.getProduct("APR_03918");
        
        assertNotNull(product);
    }

    /**
     * Test of updateWastedProduct method, of class ProductServicesImpl.
     */
    @Test
    public void testUpdateWastedProduct() {
        
    }

    public void createCategory() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_17354", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_95735", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        List<ProductLocation> productLocations2 = new ArrayList<ProductLocation>();
        ProductLocation productLocation3 = ProductLocationFactory.createProductLocation("Back storage", "BKS_16454", 80);
        ProductLocation productLocation4 = ProductLocationFactory.createProductLocation("In the store", "INS_98735", 20);

        productLocations2.add(productLocation3);
        productLocations2.add(productLocation4);

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

        Product product2 = new ProductFactory.Builder("MAR_03918")
                .setProductName("Marmalade")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations2)
                .setProductPictureURL("marmalade.jpg")
                .setProductPrice(new BigDecimal("25.95"))
                .buildProduct();

        Category category = CategoryFactory.createCategory("Long life", "LLF_02938", null);

        product1.setCategory(category);
        product2.setCategory(category);

        products.add(product1);
        products.add(product2);

        category.setProducts(products);

        categoryCrudService.persist(category);
    }
    
    public void createProductSpecial() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2017, 8, 9, 0, 0).toDate(), new DateTime(2017, 9, 9, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        List<ProductLocation> productLocations2 = new ArrayList<ProductLocation>();

        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_17354", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("On special", "SPC_95735", 20);
        
        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        ProductLocation productLocation3 = ProductLocationFactory.createProductLocation("Back storage", "BKS_11154", 80);
        ProductLocation productLocation4 = ProductLocationFactory.createProductLocation("On special", "SPC_95785", 20);
        
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

        ProductSpecial productSpecial1 = new ProductSpecialFactory.Builder(product1)
                .setDiscountPercentage(new BigDecimal("10"))
                .setStartDate(new DateTime(2013, 5, 6, 0, 0).toDate())
                .setEndDate(new DateTime(2013, 5, 15, 0, 0).toDate())
                .setSpecialDescription("")
                .setSpecialDiscountValue(new BigDecimal("0"))
                .buildProductSpecial();

        ProductSpecial productSpecial2 = new ProductSpecialFactory.Builder(product2)
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
    
    public void createWastedProducts() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2017, 8, 9, 0, 0).toDate(), new DateTime(2017, 9, 9, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        List<ProductLocation> productLocations2 = new ArrayList<ProductLocation>();

        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_76757", 70);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_35453", 10);
        ProductLocation productLocation3 = ProductLocationFactory.createProductLocation("Wasted store", "WST_87593", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);
        productLocations1.add(productLocation3);

        ProductLocation productLocation4 = ProductLocationFactory.createProductLocation("Back storage", "BKS_17354", 70);
        ProductLocation productLocation5 = ProductLocationFactory.createProductLocation("In the store", "INS_95735", 10);
        ProductLocation productLocation6 = ProductLocationFactory.createProductLocation("Wasted store", "WST_06744", 20);

        productLocations2.add(productLocation4);
        productLocations2.add(productLocation5);
        productLocations2.add(productLocation6);

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

        Product product2 = new ProductFactory.Builder("LCP_82918")
                .setProductName("Lamb Chops")
                .setQuantity(100)
                .setIsWasted(Boolean.TRUE)
                .setIsOnSpecial(Boolean.FALSE)
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

        WastedProduct wastedProduct1 = new WastedProductFactory.Builder(product1)
                .setDescription("Product printing incorrect")
                .setWasteDiscountPercentage(new BigDecimal("75"))
                .setWasteDiscountValue(new BigDecimal("0"))
                .setWastedQuantity(25)
                .buildProduct();

        WastedProduct wastedProduct2 = new WastedProductFactory.Builder(product2)
                .setDescription("Product expiration date incorrect")
                .setWasteDiscountPercentage(new BigDecimal("75"))
                .setWasteDiscountValue(new BigDecimal("0"))
                .setWastedQuantity(25)
                .buildProduct();

        List<WastedProduct> wastedProducts = new ArrayList<WastedProduct>();
        wastedProducts.add(wastedProduct1);
        wastedProducts.add(wastedProduct2);

        wastedProductCrudService.persistMultipleEntities(wastedProducts);
    }
}