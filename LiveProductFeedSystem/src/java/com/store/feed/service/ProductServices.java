/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

import com.store.feed.domain.Product;
import java.util.List;

/**
 *
 * @author Ronalds
 */
public interface ProductServices {

    public List<Product> getProductListOnCategory(String category);

    public List<Product> getProductsOnSpecial();

    public List<Product> getWastedProducts();
}
