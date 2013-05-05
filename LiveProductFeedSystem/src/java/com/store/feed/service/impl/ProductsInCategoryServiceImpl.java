/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.service.ProductsInCategoryService;
import com.store.feed.service.crud.CategoryCrudService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronalds
 */
@Service("ProductsInCategoryService")
public class ProductsInCategoryServiceImpl implements ProductsInCategoryService {
    
    @Autowired
    private CategoryCrudService categoryCrudService;

    @Override
    public List<Product> getProductList(String category) {
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
}
