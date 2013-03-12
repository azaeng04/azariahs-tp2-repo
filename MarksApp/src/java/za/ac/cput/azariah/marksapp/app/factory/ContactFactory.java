/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Contact;

/**
 *
 * @author Ronald
 */
public class ContactFactory {
    public static Contact createContact(Map<String, String> contactDetails) {
        Contact contact = new Contact();
        contact.setCell(contactDetails.get("cell"));
        contact.setEmail(contactDetails.get("email"));
        contact.setFax(contactDetails.get("fax"));
        contact.setPhone(contactDetails.get("phone"));
        return contact;
    }
}
