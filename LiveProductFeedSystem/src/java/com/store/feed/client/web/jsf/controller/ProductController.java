/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsf.controller;

/**
 *
 * @author Ronalds
 */
import com.store.feed.app.facade.ProductFacade;
import com.store.feed.domain.Product;
import com.store.feed.service.crud.ProductCrudService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProductController implements Serializable {
    ProductFacade data = new ProductFacade();
    private ProductCrudService productCrudService;
    private List<Product> filteredProducts;
    private List<Product> products;
    private Product selectedProduct;
    private List<Product> selectedProducts;

    public ProductController() {
        try {
            productCrudService = data.getProductCrudService();
            products = productCrudService.findAll();
        } catch (NullPointerException ex) {
        }
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public ProductCrudService getProductCrudService() {
        return productCrudService;
    }

    public void setProductCrudService(ProductCrudService productCrudService) {
        this.productCrudService = productCrudService;
    }

    public List<Product> getFilteredProducts() {
        return filteredProducts;
    }

    public void setFilteredProducts(List<Product> filteredProducts) {
        this.filteredProducts = filteredProducts;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
}
