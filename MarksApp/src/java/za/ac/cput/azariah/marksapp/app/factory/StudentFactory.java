/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Course;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Student;

/**
 *
 * @author Azariahs
 */
public class StudentFactory {
    public static Student createStudent(Map<String, String> studentDetails, Demographics demographics, Course course) {
        Student student = new Student();
        student.setFirstName(studentDetails.get("fName"));
        student.setLastName(studentDetails.get("lName"));
        student.setDemographic(demographics);
        student.setCourses(course);
        return student;
    }

}
