/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Mark;
import za.ac.cput.azariah.marksapp.domain.Subject;

/**
 *
 * @author Ronald
 */
public class SubjectFactory {
    public static Subject createSubject(Mark mark, Map<String, String> subjectDetails) {
        Subject subject = new Subject();
        subject.setMark(mark);
        subject.setSubjectCode(subjectDetails.get("code"));
        subject.setSubjectName(subjectDetails.get("name"));
        return subject;
    }

}
