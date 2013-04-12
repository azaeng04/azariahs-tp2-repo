/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.template;

/**
 *
 * @author Ronald
 */
public class CheeseBurgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and Cheese");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }
    
    @Override
    public void eat() {
        System.out.println("The Cheese burgers are tasty");
    }
    
    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
