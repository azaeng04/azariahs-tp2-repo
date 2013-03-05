/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Lecturer;
import za.ac.cput.azariah.marksapp.domain.Marks;
import za.ac.cput.azariah.marksapp.domain.Subject;

/**
 *
 * @author Ronald
 */
public class SubjectFactory {
    public Subject createSubject(Lecturer lecturer, Marks mark, Map<String, String> subjectDetails) {
        Subject subject = new Subject();
        subject.setLecturer(lecturer);
        subject.setMark(mark);
        subject.setSubjectCode(subjectDetails.get("code"));
        subject.setSubjectName(subjectDetails.get("name"));
        return subject;
    }

}
