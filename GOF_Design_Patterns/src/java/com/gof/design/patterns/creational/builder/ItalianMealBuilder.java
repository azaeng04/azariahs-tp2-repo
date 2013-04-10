/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.builder;

/**
 *
 * @author Azariahs
 */
public class ItalianMealBuilder implements MealBuilder{
    private Meal meal;

    public ItalianMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Red wine");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Pizza");
    }

    @Override
    public void builSide() {
        meal.setSide("Bread");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
    
}
