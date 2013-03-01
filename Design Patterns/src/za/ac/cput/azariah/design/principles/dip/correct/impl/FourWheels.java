/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.dip.correct.impl;

import za.ac.cput.azariah.design.principles.dip.correct.Wheels;

/**
 *
 * @author Ronald
 */
public class FourWheels implements Wheels{

    @Override
    public String getWheels() {
        return "Uses four wheels";
    }
    
}
