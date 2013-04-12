/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.design.patterns.behavioural.visitor;

/**
 *
 * @author Ronald
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
