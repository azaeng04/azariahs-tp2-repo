/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import za.ac.cput.azariah.marksapp.domain.Mark;

/**
 *
 * @author Ronald
 */
public class MarkFactory {
    public static Mark createMark(String grade, double value) {
        Mark mark = new Mark();
        mark.setGrade(grade);
        mark.setMark(value);
        return mark;
    }
}
