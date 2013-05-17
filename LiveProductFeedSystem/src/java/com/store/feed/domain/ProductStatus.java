/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author Ronald
 */
@Embeddable
public class ProductStatus implements Serializable {

    private String productStatus;
    private Date date;

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
