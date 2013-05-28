/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user.stockManager;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.app.facade.UserFacade;
import com.store.feed.client.web.jsp.model.user.PersonModel;
import com.store.feed.domain.Customer;
import com.store.feed.domain.StockManager;
import java.util.List;
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

    UserFacade userFacade = UserFacade.getUserFacadeInstance();
    
    @RequestMapping(value = "/stockManager.html", method = RequestMethod.GET)
    public String stockManager(Model model) {
        List<StockManager> stockManagers = userFacade.getStockManagerCrudService().findAll();
        String thePerson = "Stock Manager";
        model.addAttribute("thePerson", thePerson);
        model.addAttribute("persons", stockManagers);
        return "stockManager/stockManager";
    }
    
    @RequestMapping(value = "/addStockManager.html", method = RequestMethod.GET)
    public String addStockManager(Model model) {
        PersonModel stockManagerModel = new PersonModel();
        model.addAttribute("personModel", stockManagerModel);
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
