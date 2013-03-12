/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Address;

/**
 *
 * @author Ronald
 */
public class AddressFactory {
    public static Address createAddres(Map<String, String> addressDetails) {
        Address address = new Address();
        address.setPhysicalAddress(addressDetails.get("physicalAddress"));
        address.setPostalAddress(addressDetails.get("postalAddress"));
        address.setPostalCode(addressDetails.get("postalCode"));
        return address;
    }
}
