/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Address;
import com.store.feed.domain.Contact;
import com.store.feed.domain.Customer;
import com.store.feed.domain.Notification;
import com.store.feed.domain.Users;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class CustomerFactory {
    public static class Builder {

        private String customerNumber = "CUS_";
        private String firstName;
        private String lastName;
        private String middleName;
        private String gender;
        private Date dateOfBirth;
        private Contact contact;
        private Users user;
        private List<Address> addresses;
        private List<Notification> notifications;

        public Builder(String customerNumber, Users user) {
            this.customerNumber += customerNumber;
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

        public Builder setNotifications(List<Notification> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Customer buildCustomer() {
            return buildCustomer(this);
        }

        private Customer buildCustomer(Builder object) {
            Customer customer = new Customer();
            customer.setUsersIDNumber(object.customerNumber);
            customer.setUser(object.user);
            customer.setAddresses(object.addresses);
            customer.setDateOfBirth(object.dateOfBirth);
            customer.setFirstName(object.firstName);
            customer.setGender(object.gender);
            customer.setLastName(object.lastName);
            customer.setMiddleName(object.middleName);
            customer.setNotifications(object.notifications);
            customer.setContact(object.contact);
            return customer;
        }
    }
}
