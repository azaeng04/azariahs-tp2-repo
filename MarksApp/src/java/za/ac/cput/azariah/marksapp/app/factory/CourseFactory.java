/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.List;
import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Course;
import za.ac.cput.azariah.marksapp.domain.Subject;

/**
 *
 * @author Azariahs
 */
public class CourseFactory {
    public static Course createCourse(Map<String, String> courseDetails, List<Subject> subjects){
        Course course = new Course();
        course.setCourseCode(courseDetails.get("code"));
        course.setCourseName(courseDetails.get("name"));
        course.setSubjects(subjects);
        return course;
    }
}
