/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.test;

import com.design.service.impl.GradeServiceImpl;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210192461
 */
public class GradeServiceTest {

    private static GradeServiceImpl gradeServiceImpl;

    public GradeServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        gradeServiceImpl = new GradeServiceImpl();
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

    @Test
    public void testGradeService() {
        int grade1 = 97;
        String grading1 = gradeServiceImpl.fetchGrade(grade1);
        assertEquals(grading1, "A");
    }
}