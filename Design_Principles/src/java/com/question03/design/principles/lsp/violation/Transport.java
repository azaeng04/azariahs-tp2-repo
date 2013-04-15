/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.lsp.violation;

/**
 *
 * @author Ronald
 */
public interface Transport {
    public String hasMotor(); //Method is not applicable to all implementation types
}
