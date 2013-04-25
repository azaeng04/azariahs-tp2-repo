/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.builder.service.impl;

import com.design.pattern.builder.app.factory.MealBuilderFactory;
import com.design.pattern.builder.model.MacMeal;
import com.design.pattern.builder.service.MacMealService;

/**
 *
 * @author 210192461
 */
public class MacMealServiceImpl implements MacMealService {

    @Override
    public MacMeal placeOrder(MacMeal order) {
        MacMeal macMeal = new MealBuilderFactory.Builder(order.getMeal())
                .chips(order.getChips())
                .cooldrink(order.getCooldrink())
                .hotDrink(order.getHotDrink())
                .sauce(order.getSauce())
                .toys(order.getToys())
                .typeService(order.getTypeService())
                .upsize(order.getUpsize())
                .build();
        return macMeal;
    }
}
