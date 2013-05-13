/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.client.web.jsf.model;

/**
 *
 * @author Ronalds
 */
import com.store.feed.domain.Product;
import java.io.Serializable;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

public class ProductFilter extends ListDataModel<Product> implements SelectableDataModel<Product>, Serializable {  

    public ProductFilter() {
    }

    public ProductFilter(List<Product> data) {
        super(data);
    }
    
    @Override
    public Product getRowData(String rowKey) {
        //In a real app, a more efficient way like a query by rowKey should be implemented to deal with huge data
        
        List<Product> products = (List<Product>) getWrappedData();
        
        for(Product product : products) {
            if(product.getProductNumber().equals(rowKey))
                return product;
        }
        
        return null;
    }

    @Override
    public Object getRowKey(Product car) {
        return car.getProductNumber();
    }
}
