/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronald
 */
public interface Person {

    public List<Address> getAddresses();

    public void setAddresses(List<Address> addresses);

    public Contact getContact();

    public void setContact(Contact contact);

    public Users getUser();

    public void setUser(Users user);

    public void setFirstName(String firstName);

    public String getFirstName();

    public void setLastName(String lastName);

    public String getLastName();

    public void setMiddleName(String middleName);

    public String getMiddleName();

    public void setDateOfBirth(Date dateOfBirth);

    public Date getDateOfBirth();

    public void setGender(String gender);

    public String getGender();
}
