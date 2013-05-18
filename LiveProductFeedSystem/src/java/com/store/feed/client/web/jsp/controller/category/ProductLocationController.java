/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.category;

import com.store.feed.client.web.jsp.model.category.ProductLocationModel;
import com.store.feed.domain.ProductLocation;
import com.store.feed.service.ProductLocationServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Ronalds
 */
@Controller
@SessionAttributes
public class ProductLocationController {
    
    @RequestMapping(value = "/addProductLocations.html", method = RequestMethod.GET)
    public String addProductLocation(Model model) {
        ProductLocationModel productLocationModel = new ProductLocationModel();
        model.addAttribute("productLocationModel", productLocationModel);
        
        return "category/productLocations/addProductLocation";
    }
}
