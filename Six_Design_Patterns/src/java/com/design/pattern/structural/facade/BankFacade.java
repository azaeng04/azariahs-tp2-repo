/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.structural.facade;

/**
 *
 * @author Azariahs
 */
public class BankFacade {
    public void withdrawAmount(int amount) {
        Withdraw withdraw = new Withdraw();
        withdraw.withdrawAmount(amount);
    }
    
    public void depositAmount(int amount) {
        Deposit deposit = new Deposit();
        deposit.depositAmount(amount);
    }
}
