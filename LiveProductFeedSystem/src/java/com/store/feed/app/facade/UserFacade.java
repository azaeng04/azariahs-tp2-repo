/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.facade;

import com.store.feed.app.config.GetContext;
import com.store.feed.service.crud.CustomerCrudService;
import com.store.feed.service.crud.StockManagerCrudService;
import com.store.feed.service.crud.StoreManagerCrudService;
import java.io.Serializable;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Ronalds
 */
public class UserFacade implements Serializable {
    private static UserFacade userFacade;
    private final static ApplicationContext ctx = GetContext.getApplicationContext();
    private CustomerCrudService customerCrudService;
    private StockManagerCrudService stockManagerCrudService;
    private StoreManagerCrudService storeManagerCrudService;

    private UserFacade() {
    }

    public static synchronized UserFacade getUserFacadeInstance(){
        if (userFacade == null) {
            userFacade = new UserFacade();
        }
        return userFacade;
    }
    
    public StockManagerCrudService getStockManagerCrudService() {
        stockManagerCrudService = (StockManagerCrudService) ctx.getBean("StockManagerCrudService");
        return stockManagerCrudService;
    }
    
    public CustomerCrudService getCustomerCrudService() {
        customerCrudService = (CustomerCrudService) ctx.getBean("CustomerCrudService");
        return customerCrudService;
    }
    
    public StoreManagerCrudService getStoreManagerCrudService() {
        storeManagerCrudService = (StoreManagerCrudService) ctx.getBean("StoreManagerCrudService");
        return storeManagerCrudService;
    }
}
