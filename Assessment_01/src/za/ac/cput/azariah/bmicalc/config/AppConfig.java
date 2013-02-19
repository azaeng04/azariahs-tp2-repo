/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.bmicalc.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.azariah.bmicalc.BMI;
import za.ac.cput.azariah.bmicalc.impl.BMIimpl;

/**
 *
 * @author Ronald
 */
@Configurable
public class AppConfig {
    @Bean(name="bmi")
    public BMI getBMI() {
        return new BMIimpl();
    }

}
