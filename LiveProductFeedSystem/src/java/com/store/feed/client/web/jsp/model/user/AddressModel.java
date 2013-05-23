/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.model.user;

/**
 *
 * @author Birds pc
 */
public class AddressModel {
    private String postalAddress;
    private String physicalAddress;
    private String postalCode;

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
