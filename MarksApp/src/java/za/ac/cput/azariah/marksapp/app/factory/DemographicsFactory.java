/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Demographics;

/**
 *
 * @author Azariahs
 */
public class DemographicsFactory {
    public static Demographics createDemographics(Map<String, String> info){
        Demographics demographic = new Demographics();
        demographic.setGender(info.get("gender"));
        demographic.setRace(info.get("race"));
        return demographic;
    }
}
