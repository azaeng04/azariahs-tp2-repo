/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

import com.store.feed.domain.ProductLocation;
import java.util.List;

/**
 *
 * @author Ronalds
 */
public interface ProductLocationServices {
    public List<ProductLocation> getProductLocations(String productNumber);
    
    public void updateProductLocationQuantity(String productLocationNumber, Integer quantity);
    
    public Boolean checkIfPrimaryKeyExists(String key);
}
