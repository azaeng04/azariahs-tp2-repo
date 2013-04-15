/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.plk.violation.impl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class Order {
    List<OrderLine> orderLine = new ArrayList<OrderLine>();
    public List<OrderLine> getOrderLine() {
        return orderLine;
    }
}
