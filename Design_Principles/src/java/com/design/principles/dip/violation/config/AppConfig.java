/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.principles.dip.violation.config;

import com.design.principles.dip.violation.Wheels;
import com.design.principles.dip.violation.impl.FourWheelsImpl;
import com.design.principles.dip.violation.impl.TwoWheelsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="fourWheels")
    public Wheels getFourWheels() {
        return new FourWheelsImpl();
    }

    @Bean(name="twoWheels")
    public Wheels getTwoWheels() {
        return new TwoWheelsImpl();
    }
}
