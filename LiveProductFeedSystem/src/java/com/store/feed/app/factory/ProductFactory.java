/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Category;
import com.store.feed.domain.Notification;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.ProductStatus;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class ProductFactory {

    public static class Builder {

        private String productNumber;
        private String productName;
        private Integer quantity;
        private String productPicturURL;
        private BigDecimal productPrice;
        private Boolean onSpecial;
        private Boolean isWasted;
        private ProductStatus productStatus;
        private ProductLifespan productLifespan;
        private Category category;
        private List<ProductLocation> productLocations;
        private List<Notification> notifications;

        public Builder(String productNumber) {
            this.productNumber = productNumber;
        }

        public Builder setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        
        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        
        public Builder setNotifications(List<Notification> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder setIsWasted(Boolean isWasted) {
            this.isWasted = isWasted;
            return this;
        }

        public Builder setOnSpecial(Boolean onSpecial) {
            this.onSpecial = onSpecial;
            return this;
        }

        public Builder setProductPictureURL(String productPictureURL) {
            this.productPicturURL = productPictureURL;
            return this;
        }

        public Builder setProductPrice(BigDecimal productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public Builder setProductStatus(ProductStatus productStatus) {
            this.productStatus = productStatus;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Builder setProductLifespan(ProductLifespan productLifespan) {
            this.productLifespan = productLifespan;
            return this;
        }

        public Builder setProductLocation(List<ProductLocation> productLocations) {
            this.productLocations = productLocations;
            return this;
        }

        public Product buildProduct() {
            return buildProduct(this);
        }

        private Product buildProduct(Builder object) {
            Product product = new Product();
            product.setCategory(object.category);
            product.setIsWasted(object.isWasted);
            product.setNotifications(object.notifications);
            product.setOnSpecial(object.onSpecial);
            product.setProductLifespan(object.productLifespan);
            product.setProductLocations(object.productLocations);
            product.setProductName(object.productName);
            product.setProductNumber(object.productNumber);
            product.setProductPicturURL(object.productPicturURL);
            product.setProductPrice(object.productPrice);
            product.setProductStatus(object.productStatus);
            product.setQuantity(object.quantity);
            return product;
        }
    }
}
