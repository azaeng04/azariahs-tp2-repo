/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.facade;

import com.store.feed.app.config.GetContext;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductCrudService;
import com.store.feed.service.crud.ProductLocationCrudService;
import java.io.Serializable;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Ronalds
 */
public class CategoryFacade implements Serializable {
    private static CategoryFacade categoryFacade;
    private final static ApplicationContext ctx = GetContext.getApplicationContext();
    private CategoryCrudService categoryCrudService;
    private ProductCrudService productCrudService;
    private ProductLocationCrudService productLocationCrudService;

    private CategoryFacade() {
    }

    public static synchronized CategoryFacade getCategoryFacadeInstance(){
        if (categoryFacade == null) {
            categoryFacade = new CategoryFacade();
        }
        return categoryFacade;
    }
    
    public ProductCrudService getProductCrudService() {
        productCrudService = (ProductCrudService) ctx.getBean("ProductCrudService");
        return productCrudService;
    }
    
    public CategoryCrudService getCategoryCrudService() {
        categoryCrudService = (CategoryCrudService) ctx.getBean("CategoryCrudService");
        return categoryCrudService;
    }
    
    public ProductLocationCrudService getProductLocationCrudService() {
        productLocationCrudService = (ProductLocationCrudService) ctx.getBean("ProductLocationCrudService");
        return productLocationCrudService;
    }
}
