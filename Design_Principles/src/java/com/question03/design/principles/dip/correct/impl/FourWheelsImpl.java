/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.dip.correct.impl;

import com.question03.design.principles.dip.correct.Wheels;

/**
 *
 * @author Ronald
 */
public class FourWheelsImpl implements Wheels{

    @Override
    public String getWheels() {
        return "Uses four wheels";
    }
    
}
