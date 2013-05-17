/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.userServices;

import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.StockManagerFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.Users;
import com.store.feed.service.UserServices;
import com.store.feed.service.crud.StockManagerCrudService;
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
public class UserServicesTest {
    private static ApplicationContext ctx;
    private static StockManagerCrudService stockManagerCrudService;
    private static UserServices userServices;
    public UserServicesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        stockManagerCrudService = (StockManagerCrudService) ctx.getBean("StockManagerCrudService");
        userServices = (UserServices) ctx.getBean("UserServices");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<StockManager> stockManagers = stockManagerCrudService.findAll();
        
        stockManagerCrudService.removeMultipleEntities(stockManagers);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        List<StockManager> stockManagers = stockManagerCrudService.findAll();
        
        stockManagerCrudService.removeMultipleEntities(stockManagers);
    }

    /**
     * Test of checkUser method, of class UserServicesImpl.
     */
    @Test
    public void testCheckIfUserExists() {
        createStockManager();
        
        Boolean exists = userServices.checkIfUserExists("mikeJoans1234", "mikeJoans");
        
        assertTrue(exists);
    }
    
    @Test
    public void testIdenticalUsername() {
        Boolean exists = userServices.checkIfUsernameExists("mikeJoans1234");
        
        assertFalse(exists);
        
        createStockManager();
        
        exists = userServices.checkIfUsernameExists("mikeJoans1234");
        
        assertTrue(exists);
    }
    
    public void createStockManager() {
        List<Address> addresses = new ArrayList<Address>();
        Address address = AddressFactory.createAddress("637 Parkers Avenue", "PO Box", "7831");
        addresses.add(address);

        Contact contact = ContactFactory.createContact("0728374615", "mikejoans@gmail.com", "0217057362", "0218392837");

        List<Roles> roles = new ArrayList<Roles>();
        Roles role1 = RolesFactory.createRoles("View", "STOCKMANAGER", "mikeJoans1234");
        Roles role2 = RolesFactory.createRoles("Write", "STOCKMANAGER", "mikeJoans1234");
        roles.add(role1);
        roles.add(role2);

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