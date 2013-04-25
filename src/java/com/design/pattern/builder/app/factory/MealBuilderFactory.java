/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.builder.app.factory;

import com.design.pattern.builder.model.MacMeal;

/**
 *
 * @author 210192461
 */
public class MealBuilderFactory {

    public static class Builder {
        //Mandatory

        private String meal;
        //Optional
        private String cooldrink;
        private String sauce;
        private String typeService;
        private String hotDrink;
        private Boolean toys;
        private Boolean upsize;
        private Boolean chips;

        //Mandatory
        public Builder(String meal) {
            this.meal = meal;
        }

        //Optional
        public Builder cooldrink(String cooldrink) {
            this.cooldrink = cooldrink;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder typeService(String typeService) {
            this.typeService = typeService;
            return this;
        }

        public Builder hotDrink(String hotDrink) {
            this.hotDrink = hotDrink;
            return this;
        }

        public Builder toys(Boolean toys) {
            this.toys = toys;
            return this;
        }

        public Builder upsize(Boolean upSize) {
            this.upsize = upSize;
            return this;
        }

        public Builder chips(Boolean chips) {
            this.chips = chips;
            return this;
        }

        //Director
        public MacMeal build() {
            return meal(this);
        }

        //Builder
        private MacMeal meal(Builder builder) {
            MacMeal macMeal = new MacMeal();
            macMeal.setChips(builder.chips);
            macMeal.setCooldrink(builder.cooldrink);
            macMeal.setHotDrink(builder.hotDrink);
            macMeal.setMeal(builder.meal);
            macMeal.setSauce(builder.sauce);
            macMeal.setToys(builder.toys);
            macMeal.setTypeService(builder.typeService);
            macMeal.setUpsize(builder.upsize);
            return macMeal;
        }
    }
}
