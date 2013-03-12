/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.List;
import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Department;
import za.ac.cput.azariah.marksapp.domain.Faculty;

/**
 *
 * @author Ronald
 */
public class FacultyFactory {
    public static Faculty createFaculty(List<Department> department, Map<String, String> facultyDetails) {
        Faculty faculty = new Faculty();
        faculty.setDepartment(department);
        faculty.setFacultyCode(facultyDetails.get("code"));
        faculty.setFacultyName(facultyDetails.get("name"));
        return faculty;
    }
}
