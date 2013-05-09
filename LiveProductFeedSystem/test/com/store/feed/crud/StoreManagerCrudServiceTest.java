/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.crud;

import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.StoreManagerFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StoreManager;
import com.store.feed.domain.Users;
import com.store.feed.service.crud.AddressCrudService;
import com.store.feed.service.crud.RolesCrudService;
import com.store.feed.service.crud.StoreManagerCrudService;
import com.store.feed.service.crud.UsersCrudService;
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
public class StoreManagerCrudServiceTest {
    private static ApplicationContext ctx;
    private static StoreManagerCrudService storeManagerCrudService;
    private static RolesCrudService rolesCrudService;
    private static UsersCrudService usersCrudService;
    private static AddressCrudService addressCrudService;
    private static Long stockManagerID;
    public StoreManagerCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        storeManagerCrudService = (StoreManagerCrudService) ctx.getBean("StoreManagerCrudService");
        rolesCrudService = (RolesCrudService) ctx.getBean("RolesCrudService");
        usersCrudService = (UsersCrudService) ctx.getBean("UsersCrudService");
        addressCrudService = (AddressCrudService) ctx.getBean("AddressCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        List<Address> addresses = addressCrudService.findAll();
//        List<Roles> roles = rolesCrudService.findAll();
//        List<Users> users = usersCrudService.findAll();
//        List<StoreManager> stockManagers = storeManagerCrudService.findAll();
//        
//        addressCrudService.removeMultipleEntities(addresses);
//        rolesCrudService.removeMultipleEntities(roles);
//        usersCrudService.removeMultipleEntities(users);
//        storeManagerCrudService.removeMultipleEntities(stockManagers);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void createStoreManager() {
        List<Address> addresses = new ArrayList<Address>();
        Address address = AddressFactory.createAddress("637 Parkers Avenue", "PO Box", "7831");
        addresses.add(address);

        Contact contact = ContactFactory.createContact("0728374615", "evanJames@gmail.com", "0217057362", "0218392837");

        List<Roles> roles = new ArrayList<Roles>();
        Roles role1 = RolesFactory.createRoles("View products", "View");
        Roles role2 = RolesFactory.createRoles("Write products", "Write");
        roles.add(role1);
        roles.add(role2);

        StoreManager storeManager = new StoreManagerFactory.Builder("STR_82118")
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(new DateTime(1988, 4, 4, 0, 0).toDate())
                .setFirstName("Evan")
                .setGender("Male")
                .setLastName("James")
                .setMiddleName("Miguel")
                .buildStockManager();

        Users user = new UsersFactory.Builder()
                .setPersonNumber(storeManager.getUsersIDNumber())
                .setUsername("evanJames1234")
                .setPassword("evanJames")
                .setRoles(roles)
                .buildUser();
        
        rolesCrudService.persistMultipleEntities(roles);
        addressCrudService.persistMultipleEntities(addresses);
        storeManagerCrudService.persist(storeManager);
        usersCrudService.persist(user);
        
        stockManagerID = storeManager.getId();
    }

    @Test(dependsOnMethods = "createStoreManager")
    public void readStoreManager() {
        StoreManager stockManager = storeManagerCrudService.findById(stockManagerID);
        
        assertNotNull(stockManager);
    }

    @Test(dependsOnMethods = "createStoreManager")
    public void readStoreManagers() {
        List<StoreManager> stockManagers = storeManagerCrudService.findAll();
        
        assertTrue(stockManagers.size()>0);
    }

    @Test(dependsOnMethods = "createStoreManager")
    public void updateStoreManager() {
        StoreManager stockManager = storeManagerCrudService.findById(stockManagerID);
        
        assertNotNull(stockManager);
        
        stockManager.setFirstName("Jason");
        
        storeManagerCrudService.merge(stockManager);
        
        StoreManager stockManager1 = storeManagerCrudService.findById(stockManagerID);
        
        assertEquals(stockManager1.getFirstName(), "Jason");
    }

    @Test(dependsOnMethods = "readStoreManager")
    public void deleteStoreManager() {
//        StoreManager stockManager = storeManagerCrudService.findById(stockManagerID);
//        List<Address> addresses = addressCrudService.findAll();
//        List<Users> users = usersCrudService.findAll();
//        
//        addressCrudService.removeMultipleEntities(addresses);
//        usersCrudService.removeMultipleEntities(users);
//        storeManagerCrudService.remove(stockManager);
//        
//        StoreManager stockManager1 = storeManagerCrudService.findById(stockManagerID);
//        
//        assertNull(stockManager1);
    }
}