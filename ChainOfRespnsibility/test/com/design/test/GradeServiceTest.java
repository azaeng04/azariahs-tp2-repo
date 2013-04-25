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
        int grade1 = 80;
        gradeServiceImpl.fetchGrade(grade1);

        int grade2 = 73;
        gradeServiceImpl.fetchGrade(grade2);

        int grade3 = 65;
        gradeServiceImpl.fetchGrade(grade3);

        int grade4 = 60;
        gradeServiceImpl.fetchGrade(grade4);

        int grade5 = 57;
        gradeServiceImpl.fetchGrade(grade5);

        int grade6 = 53;
        gradeServiceImpl.fetchGrade(grade6);
    }
}