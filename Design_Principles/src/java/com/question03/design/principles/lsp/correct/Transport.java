/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.lsp.correct;

/**
 *
 * @author Ronald
 */
public interface Transport {
    public String hasWheels(); //Method is applicable to all implementation types
}
