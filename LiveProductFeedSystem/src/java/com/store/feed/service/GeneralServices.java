/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

/**
 *
 * @author 210192461
 */
public interface GeneralServices {
    public String generateRandomNumberAsString(int minimum, int maximum);
    public Integer generateRandomNumberAsInteger(int minimum, int maximum);
    public String generateUniqueRandomNumberAsString(int minimum, int maximum);
    public Integer generateUniqueRandomNumberAsInteger(int minimum, int maximum);
}
