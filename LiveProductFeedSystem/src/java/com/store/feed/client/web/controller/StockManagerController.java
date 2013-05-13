/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.controller;

import com.store.feed.app.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class StockManagerController {

    ProductFacade data = new ProductFacade();

    @RequestMapping(value = "/stockManager.html", method = RequestMethod.GET)
    public String stockManager(Model model) {

        return "stockManager/stockManager";
    }
    
    @RequestMapping(value = "/addStockManager.html", method = RequestMethod.GET)
    public String addStockManager(Model model) {

        return "stockManager/addStockManager";
    }
    
    @RequestMapping(value = "/updateStockManager.html", method = RequestMethod.GET)
    public String updateStockManager(Model model) {

        return "stockManager/updateStockManager";
    }
    
    @RequestMapping(value = "/deleteStockManager.html", method = RequestMethod.GET)
    public String deleteStockManager(Model model) {

        return "stockManager/deleteStockManager";
    }
}
