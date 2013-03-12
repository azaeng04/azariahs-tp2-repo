/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.List;
import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Lecturer;
import za.ac.cput.azariah.marksapp.domain.Subject;

/**
 *
 * @author 210192461
 */
public class LecturerFactory {
    public static Lecturer createLecturer(Demographics demographics, Map<String, String> lecturerDetails, List<Subject> subjects) {
        Lecturer lecturer = new Lecturer();
        lecturer.setDemographic(demographics);
        lecturer.setSubject(subjects);
        lecturer.setFirstName(lecturerDetails.get("firstName"));
        lecturer.setLastName(lecturerDetails.get("lastName"));
        lecturer.setStaffNumber(lecturerDetails.get("staffNumber"));
        return lecturer;
    }
}
