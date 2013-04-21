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

        private String productSpecialNumber;
        private BigDecimal specialDiscountValue;
        private Integer discountPercentage;
        private String specialDescription;
        private Date startDate;
        private Date endDate;

        public Builder(String productSpecialNumber) {
            this.productSpecialNumber = productSpecialNumber;
        }

        public Builder setSpecialDiscountValue(BigDecimal specialDiscountValue) {
            this.specialDiscountValue = specialDiscountValue;
            return this;
        }

        public Builder setDiscountPercentage(Integer discountPercentage) {
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
        
        public ProductSpecial buildProduct() {
            return buildProductSpecial(this);
        }

        private ProductSpecial buildProductSpecial(Builder object) {
            ProductSpecial productSpecial = new ProductSpecial();
            productSpecial.setDiscountPercentage(object.discountPercentage);
            productSpecial.setEndDate(object.endDate);
            productSpecial.setProductSpecialNumber(object.productSpecialNumber);
            productSpecial.setSpecialDescription(object.specialDescription);
            productSpecial.setSpecialDiscountValue(object.specialDiscountValue);
            productSpecial.setStartDate(object.startDate);
            return productSpecial;
        }
    }
}
