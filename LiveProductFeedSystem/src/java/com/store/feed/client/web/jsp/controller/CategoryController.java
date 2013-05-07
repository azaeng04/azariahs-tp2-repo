/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller;

import com.store.feed.app.facade.CategoryFacade;
import com.store.feed.client.web.jsp.model.CategoryModel;
import com.store.feed.domain.Category;
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
public class CategoryController {

    CategoryFacade data = new CategoryFacade();

    @RequestMapping(value = "/category.html", method = RequestMethod.GET)
    public String category(Model model) {

        return "category/category";
    }
    
    @RequestMapping(value = "/addCategory.html", method = RequestMethod.GET)
    public String addCategory(Model model) {

        CategoryModel categoryModel = new CategoryModel();
        model.addAttribute("categoryModel", categoryModel);
        return "category/addCategory";
    }

    @RequestMapping(value = "/persist.php", method = RequestMethod.POST)
    public String persist(CategoryModel categoryModel, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        Category category = new Category();
        category.setCategoryName(categoryModel.getCategoryName());
        data.getCategoryCrudService().persist(category);
        return "redirect:/result.html";
    }
}
