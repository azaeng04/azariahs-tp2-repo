/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Ronald
 */
@Entity
public class WastedProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal wasteDiscountValue;
    private BigDecimal wasteDiscountPercentage;
    private String description;
    private Integer wastedQuantity;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getWastedQuantity() {
        return wastedQuantity;
    }

    public void setWastedQuantity(Integer wastedQuantity) {
        this.wastedQuantity = wastedQuantity;
    }
    
    public BigDecimal getWasteDiscountValue() {
        return wasteDiscountValue;
    }

    public void setWasteDiscountValue(BigDecimal wasteDiscountValue) {
        this.wasteDiscountValue = wasteDiscountValue;
    }

    public BigDecimal getWasteDiscountPercentage() {
        return wasteDiscountPercentage;
    }

    public void setWasteDiscountPercentage(BigDecimal wasteDiscountPercentage) {
        this.wasteDiscountPercentage = wasteDiscountPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof WastedProduct)) {
            return false;
        }
        WastedProduct other = (WastedProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.store.feed.domain.Wasted[ id=" + id + " ]";
    }
    
}
