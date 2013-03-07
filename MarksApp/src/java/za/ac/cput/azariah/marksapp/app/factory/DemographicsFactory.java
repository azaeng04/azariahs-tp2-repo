/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import za.ac.cput.azariah.marksapp.domain.Demographics;

/**
 *
 * @author Azariahs
 */
public class DemographicsFactory {
    public static Demographics createDemographics(String gender, String race){
        Demographics demographic = new Demographics();
        demographic.setGender(gender);
        demographic.setRace(race);
        return demographic;
    }
}
