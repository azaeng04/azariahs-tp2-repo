/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.domain.Users;
import com.store.feed.service.UserServices;
import com.store.feed.service.crud.UsersCrudService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronalds
 */
@Service("UserServices")
public class UserServicesImpl implements UserServices {

    @Autowired
    private UsersCrudService usersCrudService;
    private static UserServicesImpl userServicesImpl;

    private UserServicesImpl() {
    }

    public synchronized static UserServicesImpl getInstance() {
        if (userServicesImpl == null) {
            userServicesImpl = new UserServicesImpl();
        }
        return userServicesImpl;
    }

    @Override
    public Boolean checkIfUserExists(String username, String password) {
        List<Users> users = usersCrudService.findAll();
        Boolean exists = false;
        if (users != null) {
            for (Users user : users) {
                if (user.getUsername().equals(username)) {
                    if (user.getPassword().equals(password)) {
                        exists = true;
                        break;
                    }
                }
            }
        }
        return exists;
    }

    @Override
    public Boolean checkIfUsernameExists(String username) {
        Boolean exists = false;
        List<Users> users = usersCrudService.findAll();
        for (Users users1 : users) {
            if (users1.getUsername().equals(username)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
}
