/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class CategoryFactory {
    public static Category createCategory(String categoryName, String categoryNumber, List<Product> products) {
        Category category = new Category();
        category.setCategoryName(categoryName);
        category.setCategoryNumber(categoryNumber);
        category.setProducts(products);
        return category;
    }
}
