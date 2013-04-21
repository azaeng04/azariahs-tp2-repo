/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.ProductStatus;
import java.util.Date;

/**
 *
 * @author Ronald
 */
public class ProductStatusFactory {
    public static ProductStatus createStatus(Date date, String productStatus) {
        ProductStatus status = new ProductStatus();
        status.setDate(date);
        status.setProductStatus(productStatus);
        return status;
    }
}
