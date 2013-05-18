/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.category;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.client.web.jsp.model.category.CategoryModel;
import com.store.feed.client.web.jsp.model.category.ProductLocationModel;
import com.store.feed.client.web.jsp.model.category.ProductModel;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLocation;
import com.store.feed.service.CategoryServices;
import com.store.feed.service.ProductLocationServices;
import com.store.feed.service.ProductServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class PersistCategoryController {

    @Autowired
    private CategoryServices categoryServices;
    @Autowired
    private ProductServices productServices;
    @Autowired
    private ProductLocationServices productLocationServices;
    private Category category;
    private Product product;
    private ProductLocation productLocations;
    CategoryFacade dataCrudService = CategoryFacade.getCategoryFacadeInstance();

    @RequestMapping(value = "/persistCategory.php", method = RequestMethod.POST)
    public String persistCategory(@ModelAttribute("categoryModel") CategoryModel categoryModel, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        category = categoryServices.addCategory(categoryModel);
        return "redirect:addProduct.html";
    }

    @RequestMapping(value = "/persistProduct.php", method = RequestMethod.POST)
    public String persistProduct(@ModelAttribute("productModel") ProductModel productModel, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        product = productServices.addProduct(productModel);
        return "redirect:addProductLocations.html";
    }

    @RequestMapping(value = "/persistProductLocation.php", method = RequestMethod.POST)
    public String persistProductLocation(@ModelAttribute("productLocationModel") ProductLocationModel productLocationModel,BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        productLocations = productLocationServices.addProductLocation(productLocationModel);
        return "redirect:addProductLocations.html";
    }
    
    @RequestMapping(value = "/persistThisCategory.php", method = RequestMethod.POST)
    public String persistThisCategory(@ModelAttribute("productLocationModel") ProductLocationModel productLocationModel,BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        
        try {
            List<Product> products = new ArrayList<Product>();
            List<ProductLocation> productLocations1 = new ArrayList<ProductLocation>();
            
            productLocations = productLocationServices.addProductLocation(productLocationModel);
            productLocations1.add(productLocations);
            product.setProductLocations(productLocations1);
            products.add(product);
            category.setProducts(products);
            dataCrudService.getCategoryCrudService().persist(category);
            productLocations = productLocationServices.addProductLocation(null);
        } catch (NullPointerException e) {
            return "redirect:category.html";
        }
        return "redirect:category.html";
    }
}
