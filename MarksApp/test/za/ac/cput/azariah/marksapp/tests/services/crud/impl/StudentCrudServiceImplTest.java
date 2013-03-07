/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.tests.services.crud.impl;

import static org.testng.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.marksapp.app.factory.CourseFactory;
import za.ac.cput.azariah.marksapp.app.factory.DemographicsFactory;
import za.ac.cput.azariah.marksapp.app.factory.StudentFactory;
import za.ac.cput.azariah.marksapp.domain.Course;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Student;
import za.ac.cput.azariah.marksapp.services.crud.StudentCrudService;

/**
 *
 * @author Azariahs
 */
public class StudentCrudServiceImplTest {
    private StudentCrudService studentCrudService;
    private Long id;
    private static ApplicationContext ctx;
    
    public StudentCrudServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:za/ac/cput/azariah/marksapp/app/config/applicationContext-*.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setDao method, of class StudentCrudServiceImpl.
     */
    @Test
    public void testCreateStudent() {
        studentCrudService = (StudentCrudService)ctx.getBean("StudentCrudService");
        
        Course course;
        
        Map<String, String> courseDetails = new HashMap<String, String>();
        courseDetails.put("code", "IT_100S");
        courseDetails.put("name", "Information Technology 1");
        
        course = CourseFactory.createCourse(courseDetails, null);
        
        assertNotNull(course);
        
        Demographics demographics = DemographicsFactory.createDemographics("Male", "African");
        
        assertNotNull(demographics);
        
        Student student;
        Map<String, String> studentDetails = new HashMap<String, String>();
        studentDetails.put("fName", "James");
        studentDetails.put("lName", "Morrison");
        student = StudentFactory.createStudent(studentDetails, demographics, course);
        
        assertNotNull(student);
        
//        studentCrudService.persist(student);
    }

}
