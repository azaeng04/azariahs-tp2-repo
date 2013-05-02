/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.StoreManager;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class StoreManagerFactory {

    public static class Builder {

        private String storeManagerNumber;
        private String firstName;
        private String lastName;
        private String middleName;
        private String gender;
        private Date dateOfBirth;
        private Contact contact;
        private List<Address> addresses;

        public Builder(String storeManagerNumber) {
            this.storeManagerNumber = storeManagerNumber;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setAddresses(List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }
        
        public StoreManager buildStockManager() {
            return buildStoreManager(this);
        }

        private StoreManager buildStoreManager(Builder object) {
            StoreManager storeManager = new StoreManager();
            storeManager.setUsersIDNumber(object.storeManagerNumber);
            storeManager.setAddresses(object.addresses);
            storeManager.setDateOfBirth(object.dateOfBirth);
            storeManager.setFirstName(object.firstName);
            storeManager.setGender(object.gender);
            storeManager.setLastName(object.lastName);
            storeManager.setMiddleName(object.middleName);
            storeManager.setContact(object.contact);
            return storeManager;
        }
    }
}
