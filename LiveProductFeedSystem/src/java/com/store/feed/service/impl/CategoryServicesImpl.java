/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.client.web.jsp.model.category.CategoryModel;
import com.store.feed.domain.Category;
import com.store.feed.service.CategoryServices;
import com.store.feed.service.crud.CategoryCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Birds pc
 */
@Service("CategoryServices")
public class CategoryServicesImpl implements CategoryServices {

    @Autowired
    private CategoryCrudService categoryCrudService;
    private static CategoryServicesImpl categoryServiceImpl;
    
    private CategoryServicesImpl() {
    }
    
    public synchronized static CategoryServicesImpl getInstance() {
        if (categoryServiceImpl == null) {
            categoryServiceImpl = new CategoryServicesImpl();
        }
        return categoryServiceImpl;
    }

    @Override
    public Category addCategory(CategoryModel categoryModel) {
        Category category = CategoryFactory.createCategory(categoryModel.getCategoryName(), categoryModel.getCategoryNumber(), null);
        return category;
    }

    @Override
    public void updateCategory(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategory(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
