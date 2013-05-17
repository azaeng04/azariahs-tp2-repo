/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Ronald
 */
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String productNumber;
    private String productName;
    private Integer quantity;
    private String productPictureURL;
    private BigDecimal productPrice;
    private Boolean isOnSpecial;
    private Boolean isWasted;
    @Embedded
    private ProductStatus productStatus;
    @Embedded
    private ProductLifespan productLifespan;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "productNumber")
    private List<ProductLocation> productLocations;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "productNumber")
    private List<Notification> notifications;

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public ProductLifespan getProductLifespan() {
        return productLifespan;
    }

    public void setProductLifespan(ProductLifespan productLifespan) {
        this.productLifespan = productLifespan;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getIsOnSpecial() {
        return isOnSpecial;
    }

    public void setIsOnSpecial(Boolean isOnSpecial) {
        this.isOnSpecial = isOnSpecial;
    }
    
    public Boolean getIsWasted() {
        return isWasted;
    }

    public void setIsWasted(Boolean isWasted) {
        this.isWasted = isWasted;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus status) {
        this.productStatus = status;
    }

    public List<ProductLocation> getProductLocations() {
        return productLocations;
    }

    public void setProductLocations(List<ProductLocation> productLocations) {
        this.productLocations = productLocations;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductPictureURL() {
        return productPictureURL;
    }

    public void setProductPictureURL(String productPictureURL) {
        this.productPictureURL = productPictureURL;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.store.feed.domain.Product[ id=" + id + " ]";
    }
}
