/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.category;

import com.store.feed.client.web.jsp.model.category.ProductLocationModel;
import com.store.feed.service.ProductLocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class ProductLocationController {

    @Autowired
    private ProductLocationServices productLocationServices;
    
    @RequestMapping(value = "/addProductLocations.html", method = RequestMethod.GET)
    public String addProductLocation(Model model) {
        ProductLocationModel productLocationModel = new ProductLocationModel();
        model.addAttribute("productLocationModel", productLocationModel);
        
        if (productLocationModel.getProductLocationNumber() !=  null) {
            productLocationServices.addProductLocation(productLocationModel);
        }
        return "category/productLocations/addProductLocation";
    }
}
