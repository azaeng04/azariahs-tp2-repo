/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.tests.services.crud.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.marksapp.app.factory.DemographicsFactory;
import za.ac.cput.azariah.marksapp.app.factory.LecturerFactory;
import za.ac.cput.azariah.marksapp.app.factory.SubjectFactory;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Lecturer;
import za.ac.cput.azariah.marksapp.domain.Subject;
import za.ac.cput.azariah.marksapp.services.crud.LecturerCrudService;

/**
 *
 * @author 210192461
 */
public class LecturerCrudServiceImplTest {
    private static LecturerCrudService lecturerCrudService;
    private static List<Lecturer> lecturerList;
    private Long id;
    private static ApplicationContext ctx;
    
    public LecturerCrudServiceImplTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:za/ac/cput/azariah/marksapp/app/config/applicationContext-*.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        lecturerList = lecturerCrudService.findAll();
        for (Lecturer lecturer : lecturerList) {
            lecturerCrudService.removeById(lecturer.getId());
        }
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        lecturerCrudService = (LecturerCrudService)ctx.getBean("LecturerCrudService");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void createLecturer() {        
        Demographics demographics = DemographicsFactory.createDemographics("Male", "Asian");
        
        Map<String, String> lecturerDetails = new HashMap<String, String>();
        lecturerDetails.put("firstName", "Kruben");
        lecturerDetails.put("lastName", "Naidoo");
        lecturerDetails.put("staffNumber", "3526351829");
        
                
        Map<String, String> subjectDetails = new HashMap<String, String>();
        
        subjectDetails.put("name", "3D Graphics Programming");
        subjectDetails.put("code", "GPD_100S");
        
        Subject subject1 = SubjectFactory.createSubject(null, subjectDetails);
        
        subjectDetails.put("name", "Web Design");
        subjectDetails.put("code", "WEBD_100S");
        
        Subject subject2 = SubjectFactory.createSubject(null, subjectDetails);
        
        List<Subject> subjects = new ArrayList<Subject>();
        
        subjects.add(subject1);
        subjects.add(subject2);
        
        Lecturer lecturer = LecturerFactory.createLecturer(demographics, lecturerDetails, subjects);
        
        lecturerCrudService.persist(lecturer);
        id = lecturer.getId();
        
        assertNotNull(lecturer);
    }
    
    @Test(dependsOnMethods= "createLecturer")
    public void readLecturer() {
        Lecturer lecturer1 = lecturerCrudService.findById(id);
        assertNotNull(lecturer1);
    } 
    
    @Test(dependsOnMethods= "createLecturer")
    public void readLecturers() {
        List<Lecturer> lecturers = lecturerCrudService.findAll();
        assertTrue(lecturers.size()>0);        
    }
    
    @Test(dependsOnMethods= "createLecturer")
    public void updateLecturer() {  
        Lecturer lecturer2 = lecturerCrudService.findById(id);
        lecturer2.setStaffNumber("9304928371");
        lecturerCrudService.merge(lecturer2);
        
        Lecturer lecturer3 = lecturerCrudService.findById(id);
        assertEquals(lecturer3.getStaffNumber(), "9304928371");
    }
    
    @Test(dependsOnMethods= "readLecturer")
    public void deleteLecturer() {      
        lecturerCrudService.removeById(id);
        Lecturer lecturer4 = lecturerCrudService.findById(id);
        
        assertNull(lecturer4);
    }
}
