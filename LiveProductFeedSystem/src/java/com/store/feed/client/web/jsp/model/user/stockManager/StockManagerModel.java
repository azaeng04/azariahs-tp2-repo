/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.model.user.stockManager;

import com.store.feed.client.web.jsp.model.user.AddressModel;
import com.store.feed.client.web.jsp.model.user.ContactModel;
import com.store.feed.client.web.jsp.model.user.UserCredentialsModel;
import com.store.feed.client.web.jsp.model.user.PersonModel;

/**
 *
 * @author Birds pc
 */
public class StockManagerModel implements PersonModel{
    private String stockManagerNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private AddressModel addressModel;
    private ContactModel contactModel;
    private UserCredentialsModel userCredentialsModel;

    @Override
    public String getUserNumber() {
        return stockManagerNumber;
    }

    @Override
    public void setUserNumber(String userNumber) {
        this.stockManagerNumber = userNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public AddressModel getAddressModel() {
        return addressModel;
    }

    @Override
    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    @Override
    public ContactModel getContactModel() {
        return contactModel;
    }

    @Override
    public void setContactModel(ContactModel contactModel) {
        this.contactModel = contactModel;
    }

    @Override
    public UserCredentialsModel getUserCredentialsModel() {
        return userCredentialsModel;
    }

    @Override
    public void setUserCredentialsModel(UserCredentialsModel userCredentialsModel) {
        this.userCredentialsModel = userCredentialsModel;
    }
}
