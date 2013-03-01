/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.dip.violation.impl;

import za.ac.cput.azariah.design.principles.dip.violation.Wheels;

/**
 *
 * @author Ronald
 */
public class TwoWheelsImpl implements Wheels{
    @Override
    public String getWheels() {
        return "Uses two wheels";
    }
}
