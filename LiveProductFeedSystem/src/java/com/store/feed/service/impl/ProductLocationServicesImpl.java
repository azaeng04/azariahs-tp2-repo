/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.app.factory.ProductLocationFactory;
import com.store.feed.client.web.jsp.model.category.ProductLocationModel;
import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLocation;
import com.store.feed.service.ProductLocationServices;
import com.store.feed.service.crud.CategoryCrudService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronalds
 */
@Service("ProductLocationServices")
public class ProductLocationServicesImpl implements ProductLocationServices {

    @Autowired
    private CategoryCrudService categoryCrudService;
    private static ProductLocationServicesImpl productLocationServicesImpl;

    private ProductLocationServicesImpl() {
    }

    public synchronized static ProductLocationServicesImpl getInstance() {
        if (productLocationServicesImpl == null) {
            productLocationServicesImpl = new ProductLocationServicesImpl();
        }
        return productLocationServicesImpl;
    }

    @Override
    public List<ProductLocation> getProductLocations(String productNumber) {
        List<Category> categories = categoryCrudService.findAll();
        List<ProductLocation> productLocations = null;

        for (Category category : categories) {
            Boolean isFound = false;
            List<Product> products = category.getProducts();
            for (Product product : products) {
                if (product.getProductNumber().equals(productNumber)) {
                    productLocations = product.getProductLocations();
                    isFound = true;
                    break;
                }
            }
            if (isFound.equals(Boolean.TRUE)) {
                break;
            }
        }
        return productLocations;
    }

    @Override
    public void updateProductLocationQuantity(String productLocationNumber, Integer quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean checkIfPrimaryKeyExists(String key) {
        List<Category> categories = categoryCrudService.findAll();
        Boolean exists;
        try {
            exists = false;
            for (Category category : categories) {
                List<Product> products = category.getProducts();
                for (Product product : products) {
                    List<ProductLocation> productLocations = product.getProductLocations();
                    for (ProductLocation productLocation : productLocations) {
                        if (productLocation.getProductLocationNumber().equals(key)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists.equals(Boolean.TRUE)) {
                        break;
                    }
                }
                if (exists.equals(Boolean.TRUE)) {
                    break;
                }
            }
        } catch (NullPointerException e) {
            exists = false;
        }
        return exists;
    }

    @Override
    public ProductLocation addProductLocation(ProductLocationModel productLocationModel) {
        ProductLocation productLocation = ProductLocationFactory.createProductLocation(productLocationModel.getProductLocationName(), productLocationModel.getProductLocationNumber(), Integer.parseInt(productLocationModel.getQuantity()));
        return productLocation;
    }
    @Override
    public void updateProductLocation(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProductLocation(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
