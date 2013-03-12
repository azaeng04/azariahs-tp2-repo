/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.List;
import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Contact;
import za.ac.cput.azariah.marksapp.domain.Course;
import za.ac.cput.azariah.marksapp.domain.Department;
import za.ac.cput.azariah.marksapp.domain.Lecturer;

/**
 *
 * @author Ronald
 */
public class DepartmentFactory {
    public static Department createDepartment(Contact contact, List<Course> courses, List<Lecturer> lecturers, Map<String, String> departmentDetails) {
        Department department = new Department();
        department.setContact(contact);
        department.setCourses(courses);
        department.setLecturer(lecturers);
        department.setDepCode(departmentDetails.get("code"));
        department.setDeptName(departmentDetails.get("name"));
        return department;
    }
}
