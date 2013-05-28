/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.database;

import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.app.factory.ProductLifespanFactory;
import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.StockManagerFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.domain.Address;
import com.store.feed.domain.Category;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.Users;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.StockManagerCrudService;
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
 * @author Birds pc
 */
public class PopulateDatabaseTest {

    private static ApplicationContext ctx;
    private static CategoryCrudService categoryCrudService;
    private static StockManagerCrudService stockManagerCrudService;

    public PopulateDatabaseTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        stockManagerCrudService = (StockManagerCrudService) ctx.getBean("StockManagerCrudService");
        categoryCrudService = (CategoryCrudService) ctx.getBean("CategoryCrudService");
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
    public void popluateDatabase() {
        createCategory1();

        createStockManager();
    }

    public void createCategory1() {
        List<Product> products = new ArrayList<Product>();
        ProductLifespan productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
        ProductLocation productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_76757", 80);
        ProductLocation productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_35453", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        Product product1 = new ProductFactory.Builder("GRN_03918")
                .setProductName("Ground Cinnamon")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("ground_cinnamon.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();

        productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        productLocations1.clear();
        productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_76857", 80);
        productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_35353", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        Product product2 = new ProductFactory.Builder("VGO_03918")
                .setProductName("Vegetable Oil")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("vegetable_oil.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();

        productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        productLocations1.clear();
        productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_96757", 80);
        productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_75453", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        Product product3 = new ProductFactory.Builder("LNT_03918")
                .setProductName("Lentils")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("lentils.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();

        productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        productLocations1.clear();
        productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_79857", 80);
        productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_35493", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        Product product4 = new ProductFactory.Builder("JLP_03918")
                .setProductName("Jell Powder")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("jelly_powder.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();

        productLifespan1 = ProductLifespanFactory.createProductLifespan(new DateTime(2018, 8, 9, 0, 0).toDate(), new DateTime(2017, 12, 12, 0, 0).toDate());
        productLocations1.clear();
        productLocation1 = ProductLocationFactory.createProductLocation("Back storage", "BKS_76717", 80);
        productLocation2 = ProductLocationFactory.createProductLocation("In the store", "INS_34353", 20);

        productLocations1.add(productLocation1);
        productLocations1.add(productLocation2);

        Product product5 = new ProductFactory.Builder("OLO_03918")
                .setProductName("Olive Oil")
                .setQuantity(100)
                .setIsWasted(Boolean.FALSE)
                .setIsOnSpecial(Boolean.FALSE)
                .setProductLifespan(productLifespan1)
                .setProductLocation(productLocations1)
                .setProductPictureURL("olive_oil.jpg")
                .setProductPrice(new BigDecimal("15.95"))
                .buildProduct();

        Category category = CategoryFactory.createCategory("Long life", "LLF_02938", null);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        category.setProducts(products);

        categoryCrudService.persist(category);
    }

    public void createStockManager() {
        List<Address> addresses = new ArrayList<Address>();
        Address address = AddressFactory.createAddress("637 Parkers Avenue", "PO Box", "7831");
        addresses.add(address);

        Contact contact = ContactFactory.createContact("0728374615", "mikejoans@gmail.com", "0217057362", "0218392837");

        List<Roles> roles = new ArrayList<Roles>();
        Roles role1 = RolesFactory.createRoles("View", "STOCKMANAGER", "mikeJoans1234");
        roles.add(role1);

        Users user = new UsersFactory.Builder("mikeJoans1234")
                .setPassword("mikeJoans")
                .setRoles(roles)
                .buildUser();

        StockManager stockManager = new StockManagerFactory.Builder("82118", user)
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(new DateTime(1988, 4, 4, 0, 0).toDate())
                .setFirstName("Mike")
                .setGender("Male")
                .setLastName("Joans")
                .setMiddleName("Daniel")
                .buildStockManager();



        stockManagerCrudService.persist(stockManager);
    }
}