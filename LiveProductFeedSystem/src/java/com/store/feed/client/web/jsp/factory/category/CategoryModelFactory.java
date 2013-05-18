/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.factory.category;

import com.store.feed.client.web.jsp.model.category.CategoryModel;

/**
 *
 * @author Birds pc
 */
public class CategoryModelFactory {
    public static CategoryModel createCategoryModel(String name, String number, Long id) {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setCategoryName(name);
        categoryModel.setCategoryNumber(number);
        categoryModel.setId(id);
        return categoryModel;
    }
}
