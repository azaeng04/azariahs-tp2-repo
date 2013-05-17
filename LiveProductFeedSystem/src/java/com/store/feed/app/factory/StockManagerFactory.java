/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.Users;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class StockManagerFactory {

    public static class Builder {

        private String stockManagerNumber = "STK_";
        private String firstName;
        private String lastName;
        private String middleName;
        private String gender;
        private Date dateOfBirth;
        private Contact contact;
        private Users user;
        private List<Address> addresses;

        public Builder(String stockManagerNumber, Users user) {
            this.stockManagerNumber += stockManagerNumber;
            this.user = user;
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

        public StockManager buildStockManager() {
            return buildStockManager(this);
        }

        private StockManager buildStockManager(Builder object) {
            StockManager stockManager = new StockManager();
            stockManager.setUsersIDNumber(object.stockManagerNumber);
            stockManager.setUser(object.user);
            stockManager.setAddresses(object.addresses);
            stockManager.setDateOfBirth(object.dateOfBirth);
            stockManager.setFirstName(object.firstName);
            stockManager.setGender(object.gender);
            stockManager.setLastName(object.lastName);
            stockManager.setMiddleName(object.middleName);
            stockManager.setContact(object.contact);
            return stockManager;
        }
    }
}
