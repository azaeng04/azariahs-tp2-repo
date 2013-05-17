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

/**
 *
 * @author Ronalds
 */
@Controller
public class PersistCategoryController {

    @Autowired
    private CategoryServices categoryServices;
    @Autowired
    private ProductServices productServices;
    @Autowired
    private ProductLocationServices productLocationServices;
    private Category category;
    private Product product;
    private List<ProductLocation> productLocations;
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
        
        List<Product> products = new ArrayList<Product>();
        
        productLocations = productLocationServices.addProductLocation(productLocationModel);
        product.setProductLocations(productLocations);
        products.add(product);
        category.setProducts(products);
        dataCrudService.getCategoryCrudService().persist(category);
        productLocationServices.addProductLocation(null);
        return "redirect:category.html";
    }
}
