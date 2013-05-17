/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.category;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.client.web.jsp.model.category.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class ProductController {

    CategoryFacade data = CategoryFacade.getCategoryFacadeInstance();

    @RequestMapping(value = "/product.html", method = RequestMethod.GET)
    public String product(Model model) {
        
        return "category/product/product";
    }
    
    @RequestMapping(value = "/addProduct.html", method = RequestMethod.GET)
    public String addProduct(Model model) {
        ProductModel productModel = new ProductModel();
        model.addAttribute("productModel", productModel);
        return "category/product/addProduct";
    }

    @RequestMapping(value = "/updateProduct.html", method = RequestMethod.GET)
    public String updateProduct(Model model) {

        return "category/product/updateProduct";
    }
    
    @RequestMapping(value = "/deleteProduct.html", method = RequestMethod.GET)
    public String deleteProduct(Model model) {

        return "category/product/deleteProduct";
    }
}
