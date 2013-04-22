/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Category;
import com.store.feed.domain.Product;
import com.store.feed.domain.ProductLifespan;
import com.store.feed.domain.ProductLocation;
import com.store.feed.domain.ProductSpecial;
import com.store.feed.domain.ProductStatus;
import com.store.feed.domain.WastedProduct;
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
        private ProductSpecial productSpecial;
        private List<ProductLocation> productLocations;
        private WastedProduct wastedProduct;

        public Builder(String productNumber, String productName, Integer quantity) {
            this.productNumber = productNumber;
            this.productName = productName;
            this.quantity = quantity;
        }

        public Builder setWastedProduct(WastedProduct wastedProduct) {
            this.wastedProduct = wastedProduct;
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

        public Builder setProductSpecial(ProductSpecial productSpecial) {
            this.productSpecial = productSpecial;
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
            product.setProductLocations(object.productLocations);
            product.setProductName(object.productName);
            product.setProductNumber(object.productNumber);
            product.setProductPicturURL(object.productPicturURL);
            product.setQuantity(object.quantity);
            product.setProductStatus(object.productStatus);
            product.setIsWasted(object.isWasted);
            product.setOnSpecial(object.onSpecial);
            product.setProductLifespan(object.productLifespan);
            product.setProductPrice(object.productPrice);
            product.setProductSpecials(object.productSpecial);
            product.setWastedProduct(object.wastedProduct);
            return product;
        }
    }
}
