/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.service.ProductServices;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductCrudService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronalds
 */
@Service("ProductServices")
public class ProductServicesImpl implements ProductServices {
    
    @Autowired
    private CategoryCrudService categoryCrudService;

    @Autowired
    private ProductCrudService productCrudService;
    
    @Override
    public List<Product> getProductListOnCategory(String category) {
        List<Category> categories = categoryCrudService.findAll();
        List<Product> products = null;
        for (Category category1 : categories) {
            if (category1.getCategoryName().equals(category)) {
                products = category1.getProducts();
                break;
            }
        }
        return products;
    }

    @Override
    public List<Product> getProductsOnSpecial() {
        List<Product> products = productCrudService.findAll();
        List<Product> productsOnSpecial = new ArrayList<Product>();
        
        for (Product product : products) {
            if (product.getIsOnSpecial().equals(Boolean.TRUE)) {
                productsOnSpecial.add(product);
            }
        }
        return productsOnSpecial;
    }
    
    @Override
    public List<Product> getWastedProducts() {
        List<Product> products = productCrudService.findAll();
        List<Product> wastedProducts = new ArrayList<Product>();
        
        for (Product product : products) {
            if (product.getIsWasted().equals(Boolean.TRUE)) {
                wastedProducts.add(product);
            }
        }
        return wastedProducts;
    }
}
