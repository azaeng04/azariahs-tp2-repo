/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

import com.store.feed.client.web.jsp.model.category.ProductLocationModel;
import com.store.feed.domain.ProductLocation;
import java.util.List;

/**
 *
 * @author Ronalds
 */
public interface ProductLocationServices {

    public ProductLocation addProductLocation(com.store.feed.client.web.jsp.model.category.ProductLocationModel productLocationModel);

    public void updateProductLocation(Long id);

    public void deleteProductLocation(Long id);

    public List<ProductLocation> getProductLocations(String productNumber);

    public void updateProductLocationQuantity(String productLocationNumber, Integer quantity);

    public Boolean checkIfPrimaryKeyExists(String key);
}
