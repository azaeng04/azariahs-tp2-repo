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
public class Order {
    private List<OrderLine> orderLine = new ArrayList<OrderLine>();

    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
}
