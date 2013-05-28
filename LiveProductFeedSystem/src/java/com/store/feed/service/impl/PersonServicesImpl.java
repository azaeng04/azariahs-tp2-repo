/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.app.facade.UserFacade;
import com.store.feed.app.factory.AddressFactory;
import com.store.feed.app.factory.ContactFactory;
import com.store.feed.app.factory.CustomerFactory;
import com.store.feed.app.factory.RolesFactory;
import com.store.feed.app.factory.StockManagerFactory;
import com.store.feed.app.factory.StoreManagerFactory;
import com.store.feed.app.factory.UsersFactory;
import com.store.feed.client.web.jsp.model.user.PersonModel;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Customer;
import com.store.feed.domain.Person;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.StoreManager;
import com.store.feed.domain.Users;
import com.store.feed.service.PersonServices;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

/**
 *
 * @author Birds pc
 */
@Service("PersonServices")
public class PersonServicesImpl implements PersonServices {

    UserFacade userFacade = UserFacade.getUserFacadeInstance();
    private static PersonServicesImpl personServiceImpl;

    private PersonServicesImpl() {
    }

    public synchronized static PersonServicesImpl getInstance() {
        if (personServiceImpl == null) {
            personServiceImpl = new PersonServicesImpl();
        }
        return personServiceImpl;
    }

    @Override
    public void addPerson(PersonModel personModel) {
        Address address = createAddress(personModel);
        Contact contact = createContact(personModel);

        List<Roles> roles = new ArrayList<Roles>();
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(address);

        if (personModel.getTypeOfUser().equals("customer")) {
            createCustomer(personModel, addresses, contact, roles);
        } else if (personModel.getTypeOfUser().equals("stockManager")) {
            createStockManager(personModel, addresses, contact, roles);
        } else {
            createStoreManager(personModel, addresses, contact, roles);
        }
    }

    @Override
    public List<Person> updatePerson(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> deletePerson(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createStockManager(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles) {
        StockManager stockManager = new StockManagerFactory.Builder(personModel.getUserNumber(), null)
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(DateTime.parse(personModel.getDateOfBirth()).toDate())
                .setFirstName(personModel.getFirstName())
                .setGender(personModel.getGender())
                .setLastName(personModel.getLastName())
                .setMiddleName(personModel.getMiddleName())
                .buildStockManager();
        Roles role1 = RolesFactory.createRoles(
                "Create, Update, Delete and View products, products on special and wasted products",
                "STOCKMANAGER",
                personModel.getUsername());
        roles.add(role1);
        Users user = new UsersFactory.Builder(personModel.getUsername())
                .setPassword(personModel.getPassword())
                .isEnabled(Boolean.TRUE)
                .setRoles(roles)
                .buildUser();
        stockManager.setUser(user);
        userFacade.getStockManagerCrudService().persist(stockManager);
    }

    @Override
    public void createStoreManager(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles) {
        StoreManager storeManager = new StoreManagerFactory.Builder(personModel.getUserNumber(), null)
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(DateTime.parse(personModel.getDateOfBirth()).toDate())
                .setFirstName(personModel.getFirstName())
                .setGender(personModel.getGender())
                .setLastName(personModel.getLastName())
                .setMiddleName(personModel.getMiddleName())
                .buildStockManager();
        Roles role1 = RolesFactory.createRoles(
                "Create, Update, Delete and View products, products on special and wasted products",
                "STOREMANAGER",
                personModel.getUsername());
        roles.add(role1);
        Users user = new UsersFactory.Builder(personModel.getUsername())
                .setPassword(personModel.getPassword())
                .isEnabled(Boolean.TRUE)
                .setRoles(roles)
                .buildUser();
        storeManager.setUser(user);
        userFacade.getStoreManagerCrudService().persist(storeManager);
    }

    @Override
    public Address createAddress(PersonModel personModel) {
        Address address = AddressFactory.createAddress(
                personModel.getPhysicalAddress(),
                personModel.getPostalAddress(),
                personModel.getPostalCode());
        return address;
    }

    @Override
    public Contact createContact(PersonModel personModel) {
        Contact contact = ContactFactory.createContact(
                personModel.getCellPhoneNumber(),
                personModel.getEmailAddress(),
                personModel.getHomeNumber(),
                personModel.getOfficeNumber());
        return contact;
    }

    @Override
    public void createCustomer(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles) {
        Customer customer = new CustomerFactory.Builder(personModel.getUserNumber(), null)
                .setAddresses(addresses)
                .setContact(contact)
                .setDateOfBirth(DateTime.parse(personModel.getDateOfBirth()).toDate())
                .setFirstName(personModel.getFirstName())
                .setGender(personModel.getGender())
                .setLastName(personModel.getLastName())
                .setMiddleName(personModel.getMiddleName())
                .setNotifications(null)
                .buildCustomer();
        Roles role1 = RolesFactory.createRoles(
                "View products, products on special and wasted products",
                "CUSTOMER",
                personModel.getUsername());
        roles.add(role1);
        Users user = new UsersFactory.Builder(personModel.getUsername())
                .setPassword(personModel.getPassword())
                .isEnabled(Boolean.TRUE)
                .setRoles(roles)
                .buildUser();
        customer.setUser(user);
        userFacade.getCustomerCrudService().persist(customer);
    }
}
