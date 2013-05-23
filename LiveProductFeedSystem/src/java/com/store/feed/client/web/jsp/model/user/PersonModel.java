/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.model.user;

/**
 *
 * @author Birds pc
 */
public interface PersonModel {

    UserCredentialsModel getUserCredentialsModel();

    void setUserCredentialsModel(UserCredentialsModel userCredentialsModel);

    AddressModel getAddressModel();

    ContactModel getContactModel();

    String getDateOfBirth();

    String getFirstName();

    String getGender();

    String getLastName();

    String getMiddleName();

    String getUserNumber();

    void setAddressModel(AddressModel addressModel);

    void setContactModel(ContactModel contactModel);

    void setDateOfBirth(String dateOfBirth);

    void setFirstName(String firstName);

    void setGender(String gender);

    void setLastName(String lastName);

    void setMiddleName(String middleName);

    void setUserNumber(String userNumber);
}
