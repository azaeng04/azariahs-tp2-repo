/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ronald
 */
@Entity
public class Customer implements Person, Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfBirth;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "customerNumber")
    private List<Address> addresses;
    
    @Embedded
    private Contact contact;
    
    @OneToMany
    @JoinColumn(name = "customerNumber")
    private List<Notification> notifications;

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.store.feed.domain.Customer[ id=" + id + " ]";
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
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
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
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public Contact getContact() {
        return contact;
    }

    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    @Override
    public String getUsersIDNumber() {
        return customerNumber;
    }

    @Override
    public void setUsersIDNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}