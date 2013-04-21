/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Customer;
import com.store.feed.domain.Roles;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.StoreManager;
import com.store.feed.domain.Users;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class UsersFactory {

    public static class Builder {

        private String username;
        private String password;
        private Customer customer;
        private StoreManager storeManager;
        private StockManager stockManager;
        private List<Roles> roles;

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setStoreManager(StoreManager storeManager) {
            this.storeManager = storeManager;
            return this;
        }

        public Builder setStockManager(StockManager stockManager) {
            this.stockManager = stockManager;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRoles(List<Roles> roles) {
            this.roles = roles;
            return this;
        }

        public Users buildUser() {
            return buildUser(this);
        }

        private Users buildUser(Builder object) {
            Users user = new Users();
            user.setCustomer(object.customer);
            user.setPassword(object.password);
            user.setRoles(object.roles);
            user.setStockManager(object.stockManager);
            user.setUsername(object.username);
            return user;
        }
    }

    public static Users createUsers(String password, Customer employee, List<Roles> roles, String username) {
        Users user = new Users();
        user.setPassword(password);
        user.setCustomer(employee);
        user.setRoles(roles);
        user.setUsername(username);
        return user;
    }
}
