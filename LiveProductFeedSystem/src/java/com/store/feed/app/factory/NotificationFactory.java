/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Notification;
import com.store.feed.domain.Product;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class NotificationFactory {

    public static Notification createNotification(Boolean isActive, String notificationNumber, List<Product> products) {
        Notification notification = new Notification();
        notification.setIsActive(isActive);
        notification.setNotificationNumber(notificationNumber);
        notification.setProducts(products);
        return notification;
    }
}
