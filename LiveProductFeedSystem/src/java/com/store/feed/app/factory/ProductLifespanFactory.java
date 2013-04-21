/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.ProductLifespan;
import java.util.Date;

/**
 *
 * @author Ronald
 */
public class ProductLifespanFactory {
    public static ProductLifespan createProductLifespan(Date bestBeforeDate, Date expirationDate) {
        ProductLifespan productLifespan = new ProductLifespan();
        productLifespan.setBestBeforeDate(bestBeforeDate);
        productLifespan.setExpirationDate(expirationDate);
        return productLifespan;
    }
}
