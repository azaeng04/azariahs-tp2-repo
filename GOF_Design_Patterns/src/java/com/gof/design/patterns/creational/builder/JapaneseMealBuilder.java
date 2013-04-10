/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.creational.builder;

/**
 *
 * @author Azariahs
 */
public class JapaneseMealBuilder implements MealBuilder{
    private Meal meal;

    public JapaneseMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Sake");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Chicken teriyaki");
    }

    @Override
    public void builSide() {
        meal.setSide("Miso soup");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
