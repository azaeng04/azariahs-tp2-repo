/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Product;
import com.store.feed.domain.WastedProduct;
import java.math.BigDecimal;

/**
 *
 * @author Ronald
 */
public class WastedProductFactory {

    public static class Builder {

        private BigDecimal wasteDiscountValue;
        private BigDecimal wasteDiscountPercentage;
        private String description;
        private Integer wastedQuantity;
        private Product product;

        public Builder(Product product) {
            this.product = product;
        }

        public Builder setWasteDiscountValue(BigDecimal wasteDiscountValue) {
            this.wasteDiscountValue = wasteDiscountValue;
            return this;
        }

        public Builder setWasteDiscountPercentage(BigDecimal wasteDiscountPercentage) {
            this.wasteDiscountPercentage = wasteDiscountPercentage;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setWastedQuantity(Integer wastedQuantity) {
            this.wastedQuantity = wastedQuantity;
            return this;
        }

        public WastedProduct buildProduct() {
            return buildWastedProduct(this);
        }

        private WastedProduct buildWastedProduct(Builder object) {
            WastedProduct wastedProduct = new WastedProduct();
            wastedProduct.setDescription(object.description);
            wastedProduct.setWasteDiscountPercentage(object.wasteDiscountPercentage);
            wastedProduct.setWasteDiscountValue(object.wasteDiscountValue);
            wastedProduct.setWastedQuantity(object.wastedQuantity);
            wastedProduct.setProduct(object.product);
            return wastedProduct;
        }
    }
}
