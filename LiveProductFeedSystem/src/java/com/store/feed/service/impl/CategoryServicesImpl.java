/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.app.factory.CategoryFactory;
import com.store.feed.client.web.jsp.factory.category.CategoryModelFactory;
import com.store.feed.client.web.jsp.model.category.CategoryModel;
import com.store.feed.domain.Category;
import com.store.feed.service.CategoryServices;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Birds pc
 */
@Service("CategoryServices")
public class CategoryServicesImpl implements CategoryServices {

    private CategoryFacade categoryFacade = CategoryFacade.getCategoryFacadeInstance();
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
    public CategoryModel editCategory(Long id) {
        Category category = categoryFacade.getCategoryCrudService().findById(id);
        CategoryModel categoryModel = CategoryModelFactory.createCategoryModel(category.getCategoryName(), category.getCategoryNumber(), id);
        return categoryModel;
    }

    @Override
    public List<Category> deleteCategory(Long id) {
        Category category = categoryFacade.getCategoryCrudService().findById(id);
        if (category != null) {
            categoryFacade.getCategoryCrudService().remove(category);
        }
        return categoryFacade.getCategoryCrudService().findAll();
    }

    @Override
    public List<Category> updateCategory(CategoryModel categoryModel) {
        Category category = categoryFacade.getCategoryCrudService().findById(categoryModel.getId());
        category.setCategoryName(categoryModel.getCategoryName());
        category.setCategoryNumber(categoryModel.getCategoryNumber());
        categoryFacade.getCategoryCrudService().merge(category);
        return categoryFacade.getCategoryCrudService().findAll();
    }
}
