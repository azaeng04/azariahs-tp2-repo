/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.test.crud;

import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.CustomerFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Customer;
import com.store.feed.domain.Roles;
import com.store.feed.domain.Users;
import com.store.feed.service.crud.AddressCrudService;
import com.store.feed.service.crud.CustomerCrudService;
import com.store.feed.service.crud.RolesCrudService;
import com.store.feed.service.crud.UsersCrudService;
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
public class CustomerCrudServiceTest {

    private static ApplicationContext ctx;
    private static CustomerCrudService customerCrudService;
    private static RolesCrudService rolesCrudService;
    private static UsersCrudService usersCrudService;
    private static AddressCrudService addressCrudService;
    private static Long customerID;
    
    public CustomerCrudServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/store/feed/app/config/applicationContext-*.xml");
        customerCrudService = (CustomerCrudService) ctx.getBean("CustomerCrudService");
        rolesCrudService = (RolesCrudService) ctx.getBean("RolesCrudService");
        usersCrudService = (UsersCrudService) ctx.getBean("UsersCrudService");
        addressCrudService = (AddressCrudService) ctx.getBean("AddressCrudService");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        List<Address> addresses = addressCrudService.findAll();
//        List<Roles> roles = rolesCrudService.findAll();
//        List<Users> users = usersCrudService.findAll();
//        List<Customer> customers = customerCrudService.findAll();
//        
//        addressCrudService.removeMultipleEntities(addresses);
//        rolesCrudService.removeMultipleEntities(roles);
//        usersCrudService.removeMultipleEntities(users);
//        customerCrudService.removeMultipleEntities(customers);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void createCustomer() {
        List<Address> addresses = new ArrayList<Address>();
        Address address = AddressFactory.createAddress("637 Parkers Avenue", "PO Box", "7831");
        addresses.add(address);

        Contact contact = ContactFactory.createContact("0728374615", "jamesparker@gmail.com", "0217057362", "0218392837");

        List<Roles> roles = new ArrayList<Roles>();
        Roles role = RolesFactory.createRoles("View product notifications", "View");
        roles.add(role);

        Customer customer = new CustomerFactory.Builder("CUS_82118")
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(new DateTime(1988, 4, 4, 0, 0).toDate())
                .setFirstName("James")
                .setGender("Male")
                .setLastName("Parker")
                .setMiddleName("Rick")
                .buildCustomer();

        Users user = new UsersFactory.Builder()
                .setPersonNumber(customer.getUsersIDNumber())
                .setUsername("jamesParker1234")
                .setPassword("jamesParker")
                .setRoles(roles)
                .buildUser();
        
        rolesCrudService.persistMultipleEntities(roles);
        addressCrudService.persistMultipleEntities(addresses);
        customerCrudService.persist(customer);
        usersCrudService.persist(user);
        
        customerID = customer.getId();
    }

    @Test(dependsOnMethods = "createCustomer")
    public void readCustomer() {
        Customer customer = customerCrudService.findById(customerID);
        
        assertNotNull(customer);
    }

    @Test(dependsOnMethods = "createCustomer")
    public void readCustomers() {
        List<Customer> customers = customerCrudService.findAll();
        
        assertTrue(customers.size()>0);
    }

    @Test(dependsOnMethods = "createCustomer")
    public void updateCustomer() {
        Customer customer = customerCrudService.findById(customerID);
        
        assertNotNull(customer);
        
        customer.setFirstName("Jason");
        
        customerCrudService.merge(customer);
        
        Customer customer1 = customerCrudService.findById(customerID);
        
        assertEquals(customer1.getFirstName(), "Jason");
    }

    @Test(dependsOnMethods = "readCustomer")
    public void deleteCustomer() {
        Customer customer = customerCrudService.findById(customerID);
        List<Address> addresses = addressCrudService.findAll();
        List<Users> users = usersCrudService.findAll();
        
        addressCrudService.removeMultipleEntities(addresses);
        usersCrudService.removeMultipleEntities(users);
        customerCrudService.remove(customer);
        
        Customer customer1 = customerCrudService.findById(customerID);
        
        assertNull(customer1);
    }
}