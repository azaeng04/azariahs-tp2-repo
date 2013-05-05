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
public interface ProductsInCategoryService {
    public List<Product> getProductList(String category);
}
