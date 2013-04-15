/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.lsp.correct.impl;

import com.question03.design.principles.lsp.correct.Transport;

/**
 *
 * @author Ronald
 */
public class UniCycleImpl implements Transport{

    @Override
    public String hasWheels() {
        return ("Has four wheels");
    }
    
}
