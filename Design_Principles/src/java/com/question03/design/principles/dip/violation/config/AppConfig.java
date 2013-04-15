/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.dip.violation.config;

import com.question03.design.principles.dip.violation.impl.FourWheelsImpl;
import com.question03.design.principles.dip.violation.impl.TwoWheelsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ronald
 */
@Configuration
public class AppConfig {
    @Bean(name="fourWheels")
    public FourWheelsImpl getFourWheels() {
        return new FourWheelsImpl();
    }

    @Bean(name="twoWheels")
    public TwoWheelsImpl getTwoWheels() {
        return new TwoWheelsImpl();
    }
}
