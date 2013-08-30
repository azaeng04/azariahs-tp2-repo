/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user.customer;

import com.store.feed.app.facade.UserFacade;
import com.store.feed.client.web.jsp.model.user.PersonModel;
import com.store.feed.domain.Customer;
import com.store.feed.domain.StockManager;
import com.store.feed.domain.StoreManager;
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
public class CustomerController {

    UserFacade userFacade = UserFacade.getUserFacadeInstance();

    @RequestMapping(value = "/customer.html", method = RequestMethod.GET)
    public String customer(Model model) {
        List<Customer> customers = userFacade.getCustomerCrudService().findAll();

        model.addAttribute("persons", customers);
        return "customer/customer";
    }

    @RequestMapping(value = "/addCustomer.html", method = RequestMethod.GET)
    public String addCustomer(Model model) {
        PersonModel customerModel = new PersonModel();
        model.addAttribute("personModel", customerModel);
        return "customer/addCustomer";
    }

    @RequestMapping(value = "/editCustomer.html", method = RequestMethod.GET)
    public String editCustomer(Model model) {

        return "customer/updateCustomer";
    }

    @RequestMapping(value = "/updateCustomer.html", method = RequestMethod.GET)
    public String updateCustomer(Model model) {

        return "customer/updateCustomer";
    }

    @RequestMapping(value = "/deleteCustomer.html", method = RequestMethod.GET)
    public String deleteCustomer(Model model) {

        return "customer/deleteCustomer";
    }
}
