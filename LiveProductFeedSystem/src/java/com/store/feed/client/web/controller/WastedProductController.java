/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.controller;

import com.store.feed.app.facade.CategoryFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class WastedProductController {

    CategoryFacade data = new CategoryFacade();

    @RequestMapping(value = "/wastedProduct.html", method = RequestMethod.GET)
    public String wastedProduct(Model model) {

        return "wastedProduct/wastedProduct";
    }
    
    @RequestMapping(value = "/addWastedProduct.html", method = RequestMethod.GET)
    public String addCategory(Model model) {

        return "category/addWastedProduct";
    }
}
