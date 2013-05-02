/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.ProductSpecial;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ronald
 */
public class ProductSpecialFactory {

    public static class Builder {

        private String productNumber;
        private BigDecimal specialDiscountValue;
        private BigDecimal discountPercentage;
        private String specialDescription;
        private Date startDate;
        private Date endDate;

        public Builder(String productNumber) {
            this.productNumber = productNumber;
        }

        public Builder setSpecialDiscountValue(BigDecimal specialDiscountValue) {
            this.specialDiscountValue = specialDiscountValue;
            return this;
        }

        public Builder setDiscountPercentage(BigDecimal discountPercentage) {
            this.discountPercentage = discountPercentage;
            return this;
        }
        
        public Builder setSpecialDescription(String specialDescription) {
            this.specialDescription = specialDescription;
            return this;
        }
        
        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }
        
        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }
        
        public ProductSpecial buildProductSpecial() {
            return buildProductSpecial(this);
        }

        private ProductSpecial buildProductSpecial(Builder object) {
            ProductSpecial productSpecial = new ProductSpecial();
            productSpecial.setDiscountPercentage(object.discountPercentage);
            productSpecial.setProductNumber(object.productNumber);
            productSpecial.setEndDate(object.endDate);
            productSpecial.setSpecialDescription(object.specialDescription);
            productSpecial.setSpecialDiscountValue(object.specialDiscountValue);
            productSpecial.setStartDate(object.startDate);
            return productSpecial;
        }
    }
}
