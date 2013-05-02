/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.facade;

import com.store.feed.app.config.GetContext;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductCrudService;
import java.io.Serializable;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Ronalds
 */
public class CategoryFacade implements Serializable {

    private final static ApplicationContext ctx = GetContext.getApplicationContext();
    private CategoryCrudService categoryCrudService;

    public CategoryCrudService getCategoryCrudService() {
        categoryCrudService = (CategoryCrudService) ctx.getBean("CategoryCrudService");
        return categoryCrudService;
    }
}
