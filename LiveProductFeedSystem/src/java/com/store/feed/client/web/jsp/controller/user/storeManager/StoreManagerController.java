/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.user.storeManager;

import com.store.feed.app.facade.UserFacade;
import com.store.feed.client.web.jsp.model.user.PersonModel;
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
public class StoreManagerController {

    UserFacade userFacade = UserFacade.getUserFacadeInstance();

    @RequestMapping(value = "/storeManager.html", method = RequestMethod.GET)
    public String storeManager(Model model) {
        List<StoreManager> storeManagers = userFacade.getStoreManagerCrudService().findAll();
        model.addAttribute("persons", storeManagers);
        return "storeManager/storeManager";
    }

    @RequestMapping(value = "/addStoreManager.html", method = RequestMethod.GET)
    public String addStoreManager(Model model) {
        PersonModel storeManagerModel = new PersonModel();
        model.addAttribute("personModel", storeManagerModel);
        return "storeManager/addStoreManager";
    }

    @RequestMapping(value = "/updateStoreManager.html", method = RequestMethod.GET)
    public String updateStoreManager(Model model) {

        return "storeManager/updateStoreManager";
    }

    @RequestMapping(value = "/deleteStoreManager.html", method = RequestMethod.GET)
    public String deleteStoreManager(Model model) {

        return "storeManager/deleteStoreManager";
    }
}
