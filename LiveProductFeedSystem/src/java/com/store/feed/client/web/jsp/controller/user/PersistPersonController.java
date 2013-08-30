/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user;

import com.store.feed.client.web.jsp.model.user.PersonModel;
import com.store.feed.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PersistPersonController {

    @Autowired
    private PersonServices personServices;

    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
    public String person(@ModelAttribute("personModel") PersonModel personModel, BindingResult result, Model model) {
        personServices.addPerson(personModel);
        if (personModel.getTypeOfUser().equals("customer")) {
            return "redirect:customer.html";
        } else if (personModel.getTypeOfUser().equals("stockManager")) {
            return "redirect:customer.html";
        } else {
            return "redirect:customer.html";
        }
    }
}
