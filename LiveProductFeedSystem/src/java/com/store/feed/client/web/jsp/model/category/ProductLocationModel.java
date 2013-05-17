/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.model.category;

/**
 *
 * @author Birds pc
 */
public class ProductLocationModel {
    private Long productLocationID;
    private String productLocationNumber;
    private String productLocationName;
    private String quantity;

    public Long getProductLocationID() {
        return productLocationID;
    }

    public void setProductLocationID(Long productLocationID) {
        this.productLocationID = productLocationID;
    }

    public String getProductLocationNumber() {
        return productLocationNumber;
    }

    public void setProductLocationNumber(String productLocationNumber) {
        this.productLocationNumber = productLocationNumber;
    }

    public String getProductLocationName() {
        return productLocationName;
    }

    public void setProductLocationName(String productLocationName) {
        this.productLocationName = productLocationName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
