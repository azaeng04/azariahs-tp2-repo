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
import za.ac.cput.azariah.marksapp.app.factory.AddressFactory;
import za.ac.cput.azariah.marksapp.app.factory.ContactFactory;
import za.ac.cput.azariah.marksapp.app.factory.CourseFactory;
import za.ac.cput.azariah.marksapp.app.factory.DemographicsFactory;
import za.ac.cput.azariah.marksapp.app.factory.DepartmentFactory;
import za.ac.cput.azariah.marksapp.app.factory.FacultyFactory;
import za.ac.cput.azariah.marksapp.app.factory.LecturerFactory;
import za.ac.cput.azariah.marksapp.app.factory.MarkFactory;
import za.ac.cput.azariah.marksapp.app.factory.SubjectFactory;
import za.ac.cput.azariah.marksapp.app.factory.UniversityFactory;
import za.ac.cput.azariah.marksapp.domain.Address;
import za.ac.cput.azariah.marksapp.domain.Contact;
import za.ac.cput.azariah.marksapp.domain.Course;
import za.ac.cput.azariah.marksapp.domain.Demographics;
import za.ac.cput.azariah.marksapp.domain.Department;
import za.ac.cput.azariah.marksapp.domain.Faculty;
import za.ac.cput.azariah.marksapp.domain.Lecturer;
import za.ac.cput.azariah.marksapp.domain.Mark;
import za.ac.cput.azariah.marksapp.domain.Subject;
import za.ac.cput.azariah.marksapp.domain.University;
import za.ac.cput.azariah.marksapp.services.crud.CourseCrudService;
import za.ac.cput.azariah.marksapp.services.crud.DepartmentCrudService;
import za.ac.cput.azariah.marksapp.services.crud.FacultyCrudService;
import za.ac.cput.azariah.marksapp.services.crud.LecturerCrudService;
import za.ac.cput.azariah.marksapp.services.crud.SubjectCrudService;
import za.ac.cput.azariah.marksapp.services.crud.UniversityCrudService;

/**
 *
 * @author Ronald
 */
public class UniversityCrudServiceImplTest {
    private static ApplicationContext ctx;
    private static UniversityCrudService universityCrudService;
    private static FacultyCrudService facultyCrudService;
    private static DepartmentCrudService departmentCrudService;
    private static CourseCrudService courseCrudService;
    private static SubjectCrudService subjectCrudService;
    private static LecturerCrudService lecturerCrudService;
    
    private static List<Lecturer> lecturers;
    private static List<Subject> subjects;
    private static List<Course> courses;
    private static List<Department> departments;
    private static List<Faculty> faculties;
    
    public UniversityCrudServiceImplTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:za/ac/cput/azariah/marksapp/app/config/applicationContext-*.xml");
        universityCrudService = (UniversityCrudService)ctx.getBean("UniversityCrudService");
        List<University> universities = universityCrudService.findAll();
        
        if (!universities.isEmpty()) {
            for (University university : universities) {
                universityCrudService.removeById(university.getId());
            }
        }
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
    
    @Test(dependsOnMethods="createFaculty")
    public void createUniversity() {
        //Create university
        universityCrudService = (UniversityCrudService)ctx.getBean("UniversityCrudService");
        
        Map<String, String> addressDetails = new HashMap<String, String>();
        addressDetails.put("postalAddress", "P.O. Box Private Bag");
        addressDetails.put("physicalAddress", "184 Lamington Street");
        addressDetails.put("postalCode", "9021");
        
        Address address = AddressFactory.createAddres(addressDetails);
        
        Map<String, String> contactDetails = new HashMap<String, String>();
        contactDetails.put("cell", "");       
        contactDetails.put("email", "design_depo@colourlovers.com");
        contactDetails.put("fax", "0219485726");
        contactDetails.put("phone", "0219485725");
        
        Contact contact = ContactFactory.createContact(contactDetails);
        
        Map<String, String> universityDetails = new HashMap<String, String>();
        universityDetails.put("code", "U83948271");
        universityDetails.put("name", "Burkley University");
        
        University university = UniversityFactory.createUniversity(address, contact, faculties, universityDetails);
                
        universityCrudService.persist(university);
    }
    
    @Test(dependsOnMethods="createDepartment")
    public void createFaculty() { 
        //Create faculty
        facultyCrudService = (FacultyCrudService)ctx.getBean("FacultyCrudService");
        
        Map<String, String> facultyDetails = new HashMap<String, String>();
        facultyDetails.put("name", "Informatics and Design");
        facultyDetails.put("code", "F73847281");
        Faculty faculty1 = FacultyFactory.createFaculty(departments, facultyDetails);
        
        faculties = new ArrayList<Faculty>();
        faculties.add(faculty1);
        
        for (Faculty faculty : faculties) {
            facultyCrudService.persist(faculty);
        }
    }
    
    @Test(dependsOnMethods="createLecturer")
    public void createDepartment() {
        //Create department
        departmentCrudService = (DepartmentCrudService)ctx.getBean("DepartmentCrudService");
        
        Map<String, String> contactDetails = new HashMap<String, String>();
        contactDetails.put("cell", "");       
        contactDetails.put("email", "design_depo@colourlovers.com");
        contactDetails.put("fax", "0219485726");
        contactDetails.put("phone", "0219485725");
        
        Contact contact = ContactFactory.createContact(contactDetails);        
        
        Map<String, String> departmentDetails = new HashMap<String, String>();
        departmentDetails.put("code", "D7384726");
        departmentDetails.put("name", "Design");        
        
        Department department1 = DepartmentFactory.createDepartment(contact, courses, lecturers, departmentDetails);
    
        departments = new ArrayList<Department>();
        departments.add(department1);
        
        for (Department department : departments) {
            departmentCrudService.persist(department);
        }
    }
    
    @Test(dependsOnMethods="createSubject")
    public void createCourse() {
        //Create course
        courseCrudService = (CourseCrudService)ctx.getBean("CourseCrudService");
        
        Map<String, String> courseDetails = new HashMap<String, String>();
        
        courseDetails.put("name", "Graphics Design");
        courseDetails.put("code", "12345");
        
        Course course1 = CourseFactory.createCourse(courseDetails, subjects);
        
        courses = new ArrayList<Course>();
        
        courses.add(course1);
        
        for (Course course : courses) {
            courseCrudService.persist(course);
        }
    }
    
    @Test(dependsOnMethods="createSubject")
    public void createLecturer() {
        //Create lecturer
        lecturerCrudService = (LecturerCrudService)ctx.getBean("LecturerCrudService");
        
        Demographics demographics = DemographicsFactory.createDemographics("Male", "Asian");
        
        Map<String, String> lecturerDetails = new HashMap<String, String>();
        
        lecturerDetails.put("firstName", "Jon");
        lecturerDetails.put("lastName", "Doe");
        lecturerDetails.put("staffNumber", "L29381781");
        
        Lecturer lecturer1 = LecturerFactory.createLecturer(demographics, lecturerDetails, subjects);
            
        lecturers = new ArrayList<Lecturer>();
        
        lecturers.add(lecturer1);
        
        for (Lecturer lecturer : lecturers) {
            lecturerCrudService.persist(lecturer);
        }
    }
    
    @Test
    public void createSubject() {
        //Create subjects
        subjectCrudService = (SubjectCrudService)ctx.getBean("SubjectCrudService");
        
        Map<String, String> subjectDetails = new HashMap<String, String>();
        
        Mark mark1 = MarkFactory.createMark("F", 0.0);
        
        subjectDetails.put("name", "3D Graphics Programming");
        subjectDetails.put("code", "GPD_100S");
        Subject subject1 = SubjectFactory.createSubject(mark1, subjectDetails);
         
        Mark mark2 = MarkFactory.createMark("F", 0.0);
        
        subjectDetails.put("name", "Web Design");
        subjectDetails.put("code", "WEBD_100S");
        
        Subject subject2 = SubjectFactory.createSubject(mark2, subjectDetails);
                
        
        subjects = new ArrayList<Subject>();
        
        subjects.add(subject1);
        subjects.add(subject2);
        
        for (Subject subject : subjects) {
            subjectCrudService.persist(subject);
        }
    }
}
