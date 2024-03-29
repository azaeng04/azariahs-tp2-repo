/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.service.impl;

import com.store.feed.domain.Product;
import com.store.feed.domain.WastedProduct;
import com.store.feed.service.WastedProductServices;
import com.store.feed.service.crud.CategoryCrudService;
import com.store.feed.service.crud.ProductCrudService;
import com.store.feed.service.crud.WastedProductCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ronalds
 */
@Service("WastedProductServices")
public class WastedProductServicesImpl implements WastedProductServices {

    @Autowired
    private CategoryCrudService categoryCrudService;
    @Autowired
    private ProductCrudService productCrudService;
    @Autowired
    private WastedProductCrudService wastedProductCrudService;
    private static WastedProductServicesImpl wastedProductServicesImpl;

    private WastedProductServicesImpl() {
    }

    public synchronized static WastedProductServicesImpl getInstance() {
        if (wastedProductServicesImpl == null) {
            wastedProductServicesImpl = new WastedProductServicesImpl();
        }
        return wastedProductServicesImpl;
    }

    @Override
    public void updateWastedProducts(String productNumber) {
        List<WastedProduct> wastedProducts = wastedProductCrudService.findAll();
        int quantity = 0;
        for (WastedProduct wastedProduct : wastedProducts) {
            Product product = wastedProduct.getProduct();
            if (product.getProductNumber().equals(productNumber)) {
                quantity = wastedProduct.getWastedQuantity();
                quantity++;
                wastedProduct.setWastedQuantity(quantity);
                wastedProductCrudService.merge(wastedProduct);
                break;
            }
        }
    }
}
