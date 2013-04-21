/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Contact;

/**
 *
 * @author Ronald
 */
public class ContactFactory {

    public static Contact createContact(String cellPhoneNumber, String emailAddress, String homeNumber, String officeNumber) {
        Contact contact = new Contact();
        contact.setCellPhoneNumber(cellPhoneNumber);
        contact.setEmailAddress(emailAddress);
        contact.setHomeNumber(homeNumber);
        contact.setOfficeNumber(officeNumber);
        return contact;
    }
}
