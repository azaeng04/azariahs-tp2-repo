/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.webservice.rest;

import com.store.feed.domain.Product;
import com.store.feed.service.ProductServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 210192461
 */
@Controller
@RequestMapping("api")
public class ProductRestController {
    @Autowired
    private ProductServices productService;
    
    @RequestMapping("products")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.getProductsOnSpecial();
    }
}