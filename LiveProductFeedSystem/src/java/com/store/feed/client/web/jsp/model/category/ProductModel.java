/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.model.category;

/**
 *
 * @author Ronalds
 */
public class ProductModel {
    private Long productID;
    private String productName;
    private String productNumber;
    private String productPrice;
    private String productBestBeforeDate;
    private String productExpirationDate;
    private String productStatus;
    private String productDeliveryDate;
    private String productQuantity;

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductDeliveryDate() {
        return productDeliveryDate;
    }

    public void setProductDeliveryDate(String productDeliveryDate) {
        this.productDeliveryDate = productDeliveryDate;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }
    
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBestBeforeDate() {
        return productBestBeforeDate;
    }

    public void setProductBestBeforeDate(String productBestBeforeDate) {
        this.productBestBeforeDate = productBestBeforeDate;
    }

    public String getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(String productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
