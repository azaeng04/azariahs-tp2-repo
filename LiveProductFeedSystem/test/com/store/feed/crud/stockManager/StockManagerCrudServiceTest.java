/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.crud.stockManager;

import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.StockManagerFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.Users;
import com.store.feed.service.crud.AddressCrudService;
import com.store.feed.service.crud.RolesCrudService;
import com.store.feed.service.crud.StockManagerCrudService;
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
public class StockManagerCrudServiceTest {
    private static ApplicationContext ctx;
    private static StockManagerCrudService stockManagerCrudService;
    private static RolesCrudService rolesCrudService;
    private static UsersCrudService usersCrudService;
    private static AddressCrudService addressCrudService;
    private static Long stockManagerID;
    public StockManagerCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        stockManagerCrudService = (StockManagerCrudService) ctx.getBean("StockManagerCrudService");
        rolesCrudService = (RolesCrudService) ctx.getBean("RolesCrudService");
        usersCrudService = (UsersCrudService) ctx.getBean("UsersCrudService");
        addressCrudService = (AddressCrudService) ctx.getBean("AddressCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        List<Address> addresses = addressCrudService.findAll();
        List<Roles> roles = rolesCrudService.findAll();
        List<Users> users = usersCrudService.findAll();
        List<StockManager> stockManagers = stockManagerCrudService.findAll();
        
        addressCrudService.removeMultipleEntities(addresses);
        rolesCrudService.removeMultipleEntities(roles);
        usersCrudService.removeMultipleEntities(users);
        stockManagerCrudService.removeMultipleEntities(stockManagers);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void createStockManager() {
        List<Address> addresses = new ArrayList<Address>();
        Address address = AddressFactory.createAddress("637 Parkers Avenue", "PO Box", "7831");
        addresses.add(address);

        Contact contact = ContactFactory.createContact("0728374615", "mikejoans@gmail.com", "0217057362", "0218392837");

        List<Roles> roles = new ArrayList<Roles>();
        Roles role1 = RolesFactory.createRoles("View products", "View");
        Roles role2 = RolesFactory.createRoles("Write products", "Write");
        roles.add(role1);
        roles.add(role2);

        StockManager stockManager = new StockManagerFactory.Builder("STK_82118")
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(new DateTime(1988, 4, 4, 0, 0).toDate())
                .setFirstName("Mike")
                .setGender("Male")
                .setLastName("Joans")
                .setMiddleName("Daniel")
                .buildStockManager();

        Users user = new UsersFactory.Builder()
                .setPersonNumber(stockManager.getUsersIDNumber())
                .setUsername("mikeJoans1234")
                .setPassword("mikeJoans")
                .setRoles(roles)
                .buildUser();
        
        rolesCrudService.persistMultipleEntities(roles);
        addressCrudService.persistMultipleEntities(addresses);
        stockManagerCrudService.persist(stockManager);
        usersCrudService.persist(user);
        
        stockManagerID = stockManager.getId();
    }

    @Test(dependsOnMethods = "createStockManager")
    public void readStockManager() {
        StockManager stockManager = stockManagerCrudService.findById(stockManagerID);
        
        assertNotNull(stockManager);
    }

    @Test(dependsOnMethods = "createStockManager")
    public void readStockManagers() {
        List<StockManager> stockManagers = stockManagerCrudService.findAll();
        
        assertTrue(stockManagers.size()>0);
    }

    @Test(dependsOnMethods = "createStockManager")
    public void updateStockManager() {
        StockManager stockManager = stockManagerCrudService.findById(stockManagerID);
        
        assertNotNull(stockManager);
        
        stockManager.setFirstName("Jason");
        
        stockManagerCrudService.merge(stockManager);
        
        StockManager stockManager1 = stockManagerCrudService.findById(stockManagerID);
        
        assertEquals(stockManager1.getFirstName(), "Jason");
    }

    @Test(dependsOnMethods = "readStockManager")
    public void deleteStockManager() {
        StockManager stockManager = stockManagerCrudService.findById(stockManagerID);
        List<Address> addresses = addressCrudService.findAll();
        List<Users> users = usersCrudService.findAll();
        
        addressCrudService.removeMultipleEntities(addresses);
        usersCrudService.removeMultipleEntities(users);
        stockManagerCrudService.remove(stockManager);
        
        StockManager stockManager1 = stockManagerCrudService.findById(stockManagerID);
        
        assertNull(stockManager1);
    }
}