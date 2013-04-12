/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.behavioural.template_method;

/**
 *
 * @author Ronald
 */
public class Withdraw extends BalanceWithdrawal{
    int balance = 2000;
    
    @Override
    public boolean checkBalance(int amount) {
        if (balance < amount) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void withdrawAmount(int amount) {
        balance -= amount;        
    }

    @Override
    public void printReciept(int amount) {
        System.out.println("Withdrawal of : R" + amount+ " Current balance " + balance);
    }
    
}
