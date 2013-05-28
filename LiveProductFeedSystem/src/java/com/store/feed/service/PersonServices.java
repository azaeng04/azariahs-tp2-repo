/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

import com.store.feed.client.web.jsp.model.user.PersonModel;
import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Person;
import com.store.feed.domain.Roles;
import java.util.List;

/**
 *
 * @author Birds pc
 */
public interface PersonServices {

    void addPerson(PersonModel personModel);

    Address createAddress(PersonModel personModel);

    Contact createContact(PersonModel personModel);

    void createCustomer(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles);

    void createStockManager(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles);

    void createStoreManager(PersonModel personModel, List<Address> addresses, Contact contact, List<Roles> roles);

    List<Person> deletePerson(Long id);

    List<Person> updatePerson(Long id);
    
}
