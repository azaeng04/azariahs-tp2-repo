/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Address;

/**
 *
 * @author Ronald
 */
public class AddressFactory {

    public static Address createAddress(String physicalAddress, String postalAddress, String postalCode) {
        Address address = new Address();
        address.setPhysicalAddress(physicalAddress);
        address.setPostalAddress(postalAddress);
        address.setPostalCode(postalCode);
        return address;
    }
}
