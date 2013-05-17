/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

/**
 *
 * @author Ronalds
 */
public interface UserServices {
    public Boolean checkIfUserExists(String username, String password);
    
    public Boolean checkIfUsernameExists(String username);
}
