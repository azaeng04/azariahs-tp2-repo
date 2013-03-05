/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.tests.services.crud.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.azariah.marksapp.services.crud.StudentCrudService;

/**
 *
 * @author Azariahs
 */
public class StudentCrudServiceImplTest {
    private StudentCrudService studentCrudService;
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
        studentCrudService = (StudentCrudService)ctx.getBean("studentCrudService");
        
        
    }

}
