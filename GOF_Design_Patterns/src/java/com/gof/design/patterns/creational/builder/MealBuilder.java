/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.builder;

/**
 *
 * @author Azariahs
 */
public interface MealBuilder {
    public void buildDrink();
    public void buildMainCourse();
    public void builSide();
    public Meal getMeal();
}
