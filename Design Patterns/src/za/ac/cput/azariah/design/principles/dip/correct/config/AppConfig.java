/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.azariah.design.principles.dip.correct.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.azariah.design.principles.dip.correct.Wheels;
import za.ac.cput.azariah.design.principles.dip.correct.impl.FourWheels;
import za.ac.cput.azariah.design.principles.dip.correct.impl.TwoWheels;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="fourWheels")
    public Wheels getFourWheels() {
        return new FourWheels();
    }

    @Bean(name="twoWheels")
    public Wheels getTwoWheels() {
        return new TwoWheels();
    }
}
