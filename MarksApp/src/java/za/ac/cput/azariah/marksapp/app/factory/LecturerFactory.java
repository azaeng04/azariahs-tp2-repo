/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Lecturer;

/**
 *
 * @author 210192461
 */
public class LecturerFactory {
    public static Lecturer createLecturer(Demographics demographics, Map<String, String> lecturerDetails) {
        Lecturer lecturer = new Lecturer();
        lecturer.setDemographic(demographics);
        lecturer.setFirstName(lecturerDetails.get("firstName"));
        lecturer.setLastName(lecturerDetails.get("lastName"));
        lecturer.setStaffNumber(lecturerDetails.get("staffNumber"));
        return lecturer;
    }
}
