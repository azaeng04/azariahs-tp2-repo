/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Notification;

/**
 *
 * @author Ronald
 */
public class NotificationFactory {

    public static Notification createNotification(Boolean isActive, String notificationNumber) {
        Notification notification = new Notification();
        notification.setIsActive(isActive);
        notification.setNotificationNumber(notificationNumber);
        return notification;
    }
}
