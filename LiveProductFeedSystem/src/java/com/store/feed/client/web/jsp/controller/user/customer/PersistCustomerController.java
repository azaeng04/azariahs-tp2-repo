/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user.customer;

import com.store.feed.client.web.jsp.model.user.customer.CustomerModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class PersistCustomerController {

    @RequestMapping(value = "/persistCustomer", method = RequestMethod.POST)
    public String customer(@ModelAttribute("customerModel") CustomerModel customerModel, BindingResult result) {
        
        return "customer/customer";
    }
}
