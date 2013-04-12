/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.mediator;

/**
 *
 * @author Ronald
 */
public class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 1.0f;
    public static final float KRONA_UNIT = 1.0f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerDollarConverter(this);
    }

    private float convertEurosToDollars(float euros) {
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + euros + " euros to  " + dollars + " dollars");
        return dollars;
    }
    
    private float convertKronaToDollars(float krona) {
        float dollars = krona * (DOLLAR_UNIT / KRONA_UNIT);
        System.out.println("Converting " + krona + " krona to  " + dollars + " dollars");
        return dollars;
    }

    public float convertCurrencyToDollars(float amount, String unitOfCurrency) {
        if ("krona".equalsIgnoreCase(unitOfCurrency)) {
            return convertKronaToDollars(amount);
        } else {
            return convertEurosToDollars(amount);
        }
    }
}
