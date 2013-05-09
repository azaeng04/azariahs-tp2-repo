/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.domain.Users;
import com.store.feed.service.UserServices;
import com.store.feed.service.crud.UsersCrudService;
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
    public Boolean checkIfPrimaryKeyExists(String key) {
//        List<Category> categories = categoryCrudService.findAll();
        Boolean isFound = false;
//        for (Category category : categories) {
//            List<Product> products = category.getProducts();
//            for (Product product : products) {
//                if (product.getProductNumber().equals(key)) {
//                    isFound = true;
//                    break;
//                }
//            }
//            if (isFound.equals(Boolean.TRUE)) {
//                break;
//            }
//        }
        return isFound;
    }
}
