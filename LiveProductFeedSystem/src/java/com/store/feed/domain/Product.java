/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private String productNumber;
    private String productName;
    private Integer quantity;
    private String productPicturURL;
    private BigDecimal productPrice;
    private Boolean onSpecial;
    private Boolean isWasted;
    @Embedded
    private ProductStatus productStatus;
    @Embedded
    private ProductLifespan productLifespan;
    @OneToOne
    private Category category;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "productNumber")
    private List<ProductLocation> productLocations;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private WastedProduct wastedProduct;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ProductSpecial productSpecials;

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

    public Boolean getOnSpecial() {
        return onSpecial;
    }

    public void setOnSpecial(Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }

    public Boolean getIsWasted() {
        return isWasted;
    }

    public void setIsWasted(Boolean isWasted) {
        this.isWasted = isWasted;
    }

    public WastedProduct getWastedProduct() {
        return wastedProduct;
    }

    public void setWastedProduct(WastedProduct wastedProduct) {
        this.wastedProduct = wastedProduct;
    }

    public ProductSpecial getProductSpecials() {
        return productSpecials;
    }

    public void setProductSpecials(ProductSpecial productSpecials) {
        this.productSpecials = productSpecials;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public String getProductPicturURL() {
        return productPicturURL;
    }

    public void setProductPicturURL(String productPicturURL) {
        this.productPicturURL = productPicturURL;
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