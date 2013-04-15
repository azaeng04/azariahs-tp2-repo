/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.question03.design.principles.dip.correct.config;

import com.question03.design.principles.dip.correct.Wheels;
import com.question03.design.principles.dip.correct.impl.FourWheelsImpl;
import com.question03.design.principles.dip.correct.impl.TwoWheelsImpl;
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
