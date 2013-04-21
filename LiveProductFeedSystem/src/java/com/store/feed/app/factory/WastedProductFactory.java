/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.WastedProduct;
import java.math.BigDecimal;

/**
 *
 * @author Ronald
 */
public class WastedProductFactory {
    public static WastedProduct createWastedProduct(String description, BigDecimal discountPercentage, BigDecimal discountValue, Integer quantity) {
        WastedProduct wastedProduct = new WastedProduct();
        wastedProduct.setDescription(description);
        wastedProduct.setWasteDiscountPercentage(discountPercentage);
        wastedProduct.setWasteDiscountValue(discountValue);
        wastedProduct.setWastedQuantity(quantity);
        return wastedProduct;
    }
}
