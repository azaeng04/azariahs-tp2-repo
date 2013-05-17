/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsp.controller.category;

import com.store.feed.client.web.jsp.model.category.CategoryModel;
import com.store.feed.domain.Category;
import com.store.feed.service.CategoryServices;
import com.store.feed.service.crud.CategoryCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Birds pc
 */
@Controller
@SessionAttributes
public class CategoryController {

    @Autowired
    private CategoryServices categoryServices;
    @Autowired
    private CategoryCrudService categoryCrudService;

    @RequestMapping(value = "/addCategory.html", method = RequestMethod.GET)
    public String addCategory(Model model) {
        CategoryModel categoryModel = new CategoryModel();
        model.addAttribute("categoryModel", categoryModel);
        return "category/addCategory";
    }

    @RequestMapping(value = "/category.html", method = RequestMethod.GET)
    public String category(Model model) {
        List<Category> categories = categoryCrudService.findAll();
        model.addAttribute("categories", categories);
        return "category/category";
    }

    @RequestMapping(value = "/updateCategory.html", method = RequestMethod.GET)
    public String updateCategory(Model model) {

        return "category/category";
    }

    @RequestMapping(value = "/deleteCategory.html", method = RequestMethod.GET)
    public String deleteCategory(Model model) {

        return "category/category";
    }
}
