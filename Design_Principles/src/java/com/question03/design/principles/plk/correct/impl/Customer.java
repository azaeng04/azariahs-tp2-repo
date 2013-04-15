/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.plk.correct.impl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class Customer {
    List<Order> orders = new ArrayList<Order>();
    public List<Order> getOrder() {
        return orders;        
    }

}
