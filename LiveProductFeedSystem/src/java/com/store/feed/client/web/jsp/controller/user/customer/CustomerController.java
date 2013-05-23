/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user.customer;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.client.web.jsp.model.user.AddressModel;
import com.store.feed.client.web.jsp.model.user.ContactModel;
import com.store.feed.client.web.jsp.model.user.UserCredentialsModel;
import com.store.feed.client.web.jsp.model.user.customer.CustomerModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class CustomerController {

    CategoryFacade data = CategoryFacade.getCategoryFacadeInstance();

    @RequestMapping(value = "/customer.html", method = RequestMethod.GET)
    public String customer(ModelMap map) {
        CustomerModel customerModel = new CustomerModel();
        AddressModel addressModel = new AddressModel();
        ContactModel contactModel = new ContactModel();
        UserCredentialsModel userCredentialsModel = new UserCredentialsModel();

        map.addAttribute("customerModel", customerModel);
        map.addAttribute("addressModel", addressModel);
        map.addAttribute("contactModel", contactModel);
        map.addAttribute("userCredentialsModel", userCredentialsModel);
        
        map.addAttribute("customerDetailsModel", map);
        return "customer/customer";
    }

    @RequestMapping(value = "/addCustomer.html", method = RequestMethod.GET)
    public String addCustomer(@ModelAttribute("customerModel") CustomerModel customerModel, BindingResult result) {
        
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
