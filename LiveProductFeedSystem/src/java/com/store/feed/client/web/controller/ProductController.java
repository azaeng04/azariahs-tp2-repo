/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.controller;

import com.store.feed.app.facade.ProductFacade;
import com.store.feed.app.factory.ProductFactory;
import com.store.feed.client.web.model.ProductModel;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronalds
 */
@Controller
public class ProductController {

    ProductFacade data = new ProductFacade();

    @RequestMapping(value = "/product.html", method = RequestMethod.GET)
    public String product(Model model) {

        return "product/product";
    }
    
    @RequestMapping(value = "/addProduct.html", method = RequestMethod.GET)
    public String addProduct(Model model) {

        return "product/addProduct";
    }

    @RequestMapping(value = "/updateProduct.html", method = RequestMethod.GET)
    public String updateProduct(Model model) {

        return "product/updateProduct";
    }
    
    @RequestMapping(value = "/deleteProduct.html", method = RequestMethod.GET)
    public String deleteProduct(Model model) {

        return "product/deleteProduct";
    }
    
    @RequestMapping(value = "/persist.php", method = RequestMethod.POST)
    public String persist(ProductModel productModel, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        Product product = new ProductFactory.Builder("hfhie")
                .setProductName(productModel.getProductName())
                .buildProduct();
        return "redirect:/result.html";
    }
}
