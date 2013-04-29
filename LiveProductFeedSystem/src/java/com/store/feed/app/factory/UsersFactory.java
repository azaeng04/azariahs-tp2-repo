/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Person;
import com.store.feed.domain.Roles;
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
        private Person person;
        private List<Roles> roles;

        public Builder setPerson(Person person) {
            this.person = person;
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
            user.setPerson(object.person);
            user.setPassword(object.password);
            user.setRoles(object.roles);
            user.setUsername(object.username);
            return user;
        }
    }
}
