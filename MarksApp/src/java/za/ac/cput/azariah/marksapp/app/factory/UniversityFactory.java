/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.marksapp.app.factory;

import java.util.List;
import java.util.Map;
import za.ac.cput.azariah.marksapp.domain.Address;
import za.ac.cput.azariah.marksapp.domain.Contact;
import za.ac.cput.azariah.marksapp.domain.Faculty;
import za.ac.cput.azariah.marksapp.domain.University;

/**
 *
 * @author Ronald
 */
public class UniversityFactory {
    public static University createUniversity(Address address, Contact contact, List<Faculty> faculties, Map<String, String> universityDetails) {
        University university = new University();
        university.setAddress(address);
        university.setContact(contact);
        university.setFaculties(faculties);
        university.setUniversityCode(universityDetails.get("code"));
        university.setUniversityName(universityDetails.get("name"));
        return university;
    }
}
