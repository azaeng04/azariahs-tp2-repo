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
public class CustomerController {

    ProductFacade data = new ProductFacade();

    @RequestMapping(value = "/customer.html", method = RequestMethod.GET)
    public String customer(Model model) {

        return "customer/customer";
    }
    
    @RequestMapping(value = "/addCustomer.html", method = RequestMethod.GET)
    public String addCustomer(Model model) {

        return "customer/addCustomer";
    }

    @RequestMapping(value = "/updateCustomer.html", method = RequestMethod.GET)
    public String updateProduct(Model model) {

        return "customer/updateCustomer";
    }
    
    @RequestMapping(value = "/deleteCustomer.html", method = RequestMethod.GET)
    public String deleteProduct(Model model) {

        return "customer/deleteCustomer";
    }
}
