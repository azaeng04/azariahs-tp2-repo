/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.template_method;

/**
 *
 * @author Ronald
 */
public abstract class BalanceWithdrawal {
    public final void doWithdrawal(int amount){
        if (checkBalance(amount)) {
            System.out.println("Unable to withdraw R" + amount + " exceeds current balance");
        } else {
            withdrawAmount(amount);
            printReciept(amount);
        }        
    }
    
    public abstract boolean checkBalance(int amount);
    public abstract void withdrawAmount(int amount);
    public abstract void printReciept(int amount);
}
