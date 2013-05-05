/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.ProductLocation;

/**
 *
 * @author Ronald
 */
public class ProductLocationFactory {
    public static ProductLocation createProductLocation(String productLocationName, String productLocationNumber, Integer quantity) {
        ProductLocation productLocation = new ProductLocation();
        productLocation.setProductLocationName(productLocationName);
        productLocation.setProductLocationNumber(productLocationNumber);
        productLocation.setQuantity(quantity);
        return productLocation;
    }
}
