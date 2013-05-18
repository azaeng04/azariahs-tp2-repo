/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service;

import com.store.feed.client.web.jsp.model.category.CategoryModel;
import com.store.feed.domain.Category;
import java.util.List;

/**
 *
 * @author Birds pc
 */
public interface CategoryServices {

    public Category addCategory(CategoryModel categoryModel);

    public CategoryModel editCategory(Long id);

    public List<Category> updateCategory(CategoryModel categoryModel);
    
    public List<Category> deleteCategory(Long id);
}
